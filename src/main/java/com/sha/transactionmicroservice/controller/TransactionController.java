package com.sha.transactionmicroservice.controller;

import com.sha.transactionmicroservice.model.Transaction;
import com.sha.transactionmicroservice.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;


    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteTransaction(@RequestBody Long transactionId) {
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllTransactionsOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
    }

}
