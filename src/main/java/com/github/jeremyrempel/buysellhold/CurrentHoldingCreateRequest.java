package com.github.jeremyrempel.buysellhold;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record CurrentHoldingCreateRequest(
        String title,
        @JsonProperty("buy_date") LocalDate buyDate
) {
}
