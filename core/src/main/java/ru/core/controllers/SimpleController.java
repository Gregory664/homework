package ru.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.calculator.Calculator;

@RestController
public class SimpleController {
    @RequestMapping(value = "/sum", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return Calculator.sum(a, b);
    }

    @RequestMapping(value = "/min", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int min(@RequestParam("a") int a, @RequestParam("b") int b) {
        return Calculator.min(a, b);
    }

    @RequestMapping(value = "/div", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public double div(@RequestParam("a") int a, @RequestParam("b") int b) {
        return Calculator.div(a, b);
    }

    @RequestMapping(value = "/multiple", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int multiple(@RequestParam("a") int a, @RequestParam("b") int b) {
        return Calculator.multiple(a, b);
    }
}
