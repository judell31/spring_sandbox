package com.spring.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", allowCredentials = "true")
public class Controller {

    @Autowired
    private SandBoxService sandBoxService;

    @GetMapping("/get-user/{userId}")
    public SandBoxResponse get(@PathVariable("userId") Long userId){
        return sandBoxService.getUser(userId);
    }

    @PostMapping("/add-user")
    public SandBoxResponse add(@RequestBody SandBoxRequest sandBoxRequest) {
        return sandBoxService.addUser(sandBoxRequest);
    }

    @PutMapping("/update-user/{userId}")
    public SandBoxResponse updateUser(@PathVariable("userId") Long userId, @RequestBody Request request) {
        return sandBoxService.updateUser(userId, request);
    }

    @DeleteMapping("/delete/{userId}")
    public Integer delete(@PathVariable("userId") Long userId){
        return sandBoxService.deleteUser(userId);
    }
}
