package com.school.testapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.school.testapi.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public List<String> getHelloWorld() {
        return testService.getAll();
    }

    @PutMapping("/hello")
    public void putHelloWorld(@RequestBody String value){
        testService.add(value);
    }

    @PostMapping("/hello/{index}")
    public void postHelloWorld(@PathVariable int index, @RequestBody String value){
        testService.update(index, value);
    }

    @DeleteMapping("/hello/{index}")
    public void deleteHelloWorld(@PathVariable int index){
        testService.delete(index);
    }
}
