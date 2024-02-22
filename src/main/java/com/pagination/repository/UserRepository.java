package com.pagination.repository;

import com.pagination.Dao.User;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Page<User> findByNameContaining(String name, Pageable pageable);
}