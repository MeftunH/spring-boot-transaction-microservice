package com.sha.springboottransactionmicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITransactionRepository extends JpaRepository<ITransactionRepository, Long> {
   List<ITransactionRepository> findAllByUserId(Long userId);
}
