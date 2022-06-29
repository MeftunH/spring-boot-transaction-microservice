package com.sha.springboottransactionmicroservice.Controller;

import com.sha.springboottransactionmicroservice.Model.Transaction;
import com.sha.springboottransactionmicroservice.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {
  @Autowired
  private TransactionService transactionService;

  @PostMapping
  public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
     return new ResponseEntity<>(transactionService.saveTransaction(transaction),
             HttpStatus.CREATED);
  }

  @DeleteMapping("/{transactionId}")
  public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId) {

      if (transactionService.existsById(transactionId)) {
          transactionService.deleteTransaction(transactionId);
          return new ResponseEntity<>(HttpStatus.OK);
      } else {
          return ResponseEntity.badRequest().body("Transaction with id " + transactionId + " does not exist");
      }
  }

  @GetMapping("/{userId}")
  public ResponseEntity<?> getAllTransactionsOfUser(@PathVariable Long userId) {
     return new ResponseEntity<>(transactionService.findAllTransactionsByUserId(userId),
             HttpStatus.OK);
  }
}
