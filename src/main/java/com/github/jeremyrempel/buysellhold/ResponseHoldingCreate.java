package com.github.jeremyrempel.buysellhold;

import java.util.Optional;

public record ResponseHoldingCreate(String status, Optional<Long> id) {
}
