package com.github.jeremyrempel.buysellhold;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Optional;

public record CurrentHoldingCreateRequest(
        String symbol,
        Optional<String> title,
        @JsonProperty("buy_date") LocalDate buyDate
) {
}
