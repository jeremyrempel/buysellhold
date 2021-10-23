package com.github.jeremyrempel.buysellhold;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class BuysellholdApplication {

    @Value("${userBucket.path}")
    private String dbUrl;


    public static void main(String[] args) {
        SpringApplication.run(BuysellholdApplication.class, args);
    }
}
