package com.sha.springboottransactionmicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Transaction extends JpaRepository<Transaction, Long> {
   List<Transaction> findAllByUserId(Long userId);
}
