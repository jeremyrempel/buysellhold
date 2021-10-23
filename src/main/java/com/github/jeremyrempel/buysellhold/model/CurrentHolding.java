package com.github.jeremyrempel.buysellhold.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentHolding {

    @Id
    Long id;
    String title;
    LocalDate buyDate;
    LocalDateTime createDate;

    public CurrentHolding(
            String title,
            LocalDate buyDate
    ) {
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
