package com.cashBook.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cashBook.entites.Transaction;
@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
