package com.example.spring.service;

import com.example.spring.model.User;


public interface UserService {

    User create(User user);

    Iterable<User> findAll();

    User findById(Long id);

    User update(Long id, User user);

    void delete(Long id);
}
