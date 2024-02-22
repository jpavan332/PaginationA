package com.pagination.service;

import com.pagination.Dao.User;
import com.pagination.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@Transactional
public class UserService
{
    @Autowired
    UserRepository userRepository;
    Page<User> getUsers(String name, int page, int size){

            return userRepository.findByNameContaining(name, (Pageable) PageRequest.of(page,size));
    }
}
