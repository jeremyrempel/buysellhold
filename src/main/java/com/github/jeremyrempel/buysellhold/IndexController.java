package com.github.jeremyrempel.buysellhold;

import com.github.jeremyrempel.buysellhold.model.CurrentHolding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    final HoldingRepository repository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public IndexController(HoldingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index() {
        return "hello world";
    }

    @GetMapping("/holdings")
    public Iterable<CurrentHolding> holdingsList() {
        return repository.findAll();
    }

    @PostMapping("/holdings")
    public Long createHoldings(@RequestBody CurrentHoldingCreateRequest request) {
        var record = new CurrentHolding(request.symbol(), request.title(), request.buyDate());
        return repository.save(record).getId();
    }
}
