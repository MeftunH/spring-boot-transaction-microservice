package com.sha.springboottransactionmicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Transaction extends JpaRepository<Transaction, Long> {
   List<Transaction> findAllByUserId(Long userId);
}
