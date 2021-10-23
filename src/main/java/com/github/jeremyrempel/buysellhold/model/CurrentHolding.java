package com.github.jeremyrempel.buysellhold.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record CurrentHolding(
        @Id Long id,
        String title,
        @JsonProperty("buy_date") LocalDate buyDate,
        LocalDateTime createDate
) {

    public CurrentHolding {

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
