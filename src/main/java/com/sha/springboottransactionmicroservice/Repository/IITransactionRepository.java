package com.sha.springboottransactionmicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IITransactionRepository extends JpaRepository<IITransactionRepository, Long> {
   List<IITransactionRepository> findAllByUserId(Long userId);
}
