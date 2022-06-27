package com.sha.springboottransactionmicroservice.Service;

import com.sha.springboottransactionmicroservice.Model.Transaction;
import com.sha.springboottransactionmicroservice.Repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService extends ITransactionService {
  @Autowired
    private ITransactionRepository transactionRepository;

  @Override
  public Transaction saveTransaction(Transaction transaction) {
      transaction.setCreatedAt(LocalDateTime.now());
      return transactionRepository.save(transaction);
  }

  @Override
  public void deleteTransaction(Long id) {
      transactionRepository.deleteById(id);
  }

  @Override
  public List<Transaction> findAllTransactionsByUserId(Long userId) {
      return transactionRepository.findAllByUserId(userId);
  }
}
