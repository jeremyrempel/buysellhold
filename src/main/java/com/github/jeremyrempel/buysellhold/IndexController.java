package com.github.jeremyrempel.buysellhold;

import com.github.jeremyrempel.buysellhold.model.CurrentHolding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
public class IndexController {

    final HoldingRepository repository;

    @Autowired
    public IndexController(HoldingRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/holdings")
    public Flux<CurrentHolding> index() {
        return repository.findAll();
    }

    @PostMapping("/holdings")
    public Mono<ResponseHoldingCreate> create(@RequestBody CurrentHolding holding) {
        return repository
                .save(holding)
                .map(CurrentHolding::getId)
                .map(x -> new ResponseHoldingCreate("OK", Optional.of(x)));
    }
}
