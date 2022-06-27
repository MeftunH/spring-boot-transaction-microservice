package com.sha.springboottransactionmicroservice.Service;

import com.sha.springboottransactionmicroservice.Model.Transaction;

import java.util.List;

public abstract class ITransactionService {
    public abstract Transaction saveTransaction(Transaction transaction);

    public abstract void deleteTransaction(Long id);

    public abstract List<Transaction> findAllTransactionsByUserId(Long userId);
}
