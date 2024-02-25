package com.pagination.service;

import com.pagination.Dao.User;
import com.pagination.repository.UserRepository;
import jakarta.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class UserService
{
    private final UserRepository userRepository = null;
//    private static final Logger logger = LogManager.getLogger(UserService.class);
    public Page<User> getUsers(String name, int page, int size){

//    		logger.info("Fetching users for page {} of size {}",page, size);
            return userRepository.findByNameContaining(name, (Pageable) PageRequest.of(page,size));
    }
}
