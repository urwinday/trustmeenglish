package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SomeController {

    private final UserService userService;

    @GetMapping("/hello/{id}")
    public User sayHello(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
