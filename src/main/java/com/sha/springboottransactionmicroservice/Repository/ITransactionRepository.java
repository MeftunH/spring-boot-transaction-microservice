package com.sha.springboottransactionmicroservice.Repository;

import com.sha.springboottransactionmicroservice.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
   List<Transaction> findAllByUserId(Long userId);
}
