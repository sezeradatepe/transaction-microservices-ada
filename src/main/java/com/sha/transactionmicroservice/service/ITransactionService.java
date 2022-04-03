package com.sha.transactionmicroservice.service;

import com.sha.transactionmicroservice.model.Transaction;

import java.util.List;

public interface ITransactionService{
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
