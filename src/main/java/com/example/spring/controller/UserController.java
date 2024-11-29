package com.example.spring.controller;

import com.example.spring.model.User;
import com.example.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/users")
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }
}
