package com.example.spring.repository;

import com.example.spring.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long> {

}