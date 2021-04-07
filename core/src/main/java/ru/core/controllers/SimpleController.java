package ru.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {
    @RequestMapping(value = "/sum", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return 0;
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int min(@RequestParam("a") int a, @RequestParam("b") int b) {
        return 0;
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int div(@RequestParam("a") int a, @RequestParam("b") int b) {
        return 0;
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int multiple(@RequestParam("a") int a, @RequestParam("b") int b) {
        return 0;
    }
}
