package com.github.jeremyrempel.buysellhold;

import com.github.jeremyrempel.buysellhold.model.CurrentHolding;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface HoldingRepository extends ReactiveCrudRepository<CurrentHolding, Long> {
//    CurrentHolding findByTitle(String title);
}
