package com.github.jeremyrempel.buysellhold;

import com.github.jeremyrempel.buysellhold.model.CurrentHolding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class IndexController {

    final HoldingRepository repository;

    @Autowired
    public IndexController(HoldingRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/")
    public Flux<CurrentHolding> index() {

        var blah = repository.findAll();

        return blah;
    }
}
