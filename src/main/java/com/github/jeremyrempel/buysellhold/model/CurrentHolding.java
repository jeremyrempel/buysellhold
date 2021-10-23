package com.github.jeremyrempel.buysellhold.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class CurrentHolding {

    @Id
    Long id;
    String title;
    String symbol;
    LocalDate buyDate;
    LocalDateTime createDate;

    public CurrentHolding(
            String title,
            Optional<String> symbol,
            LocalDate buyDate
    ) {
        this.symbol = symbol.orElseThrow();
        this.title = title;
        this.buyDate = buyDate;
        this.createDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
