package com.github.jeremyrempel.buysellhold;

import com.github.jeremyrempel.buysellhold.model.CurrentHolding;
import org.springframework.data.repository.CrudRepository;

public interface HoldingRepository extends CrudRepository<CurrentHolding, Long> {
//    CurrentHolding findByTitle(String title);
}
