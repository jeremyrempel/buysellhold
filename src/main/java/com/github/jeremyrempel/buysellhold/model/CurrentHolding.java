package com.github.jeremyrempel.buysellhold.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record CurrentHolding(@Id Long id, String title, LocalDateTime buyDate,
                             LocalDateTime createDate) {

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getBuyDate() {
        return buyDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
