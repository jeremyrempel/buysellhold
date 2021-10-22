package com.github.jeremyrempel.buysellhold;

import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.pool.ConnectionPoolConfiguration;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import java.time.Duration;

@SpringBootApplication
@Configuration
@EnableR2dbcRepositories
public class R2dbConfiguration extends AbstractR2dbcConfiguration {

    @Value("${connectionString}")
    private String connectionString;

    public static void main(String[] args) {
        SpringApplication.run(R2dbConfiguration.class, args);
    }

    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        //connectionString looks like this:
        //r2dbc:gcp:mysql://user:123456@my-project:us-central1:r2dbctest/
        ConnectionFactory connectionFactory = ConnectionFactories.get(connectionString);
        ConnectionPoolConfiguration configuration = ConnectionPoolConfiguration
                .builder(connectionFactory)
                .maxIdleTime(Duration.ofMillis(1000))
                .maxSize(20)
                .build();

        return new ConnectionPool(configuration);
    }
}