package com.cashBook.service;

import com.cashBook.dtos.TransactionDto;
import com.cashBook.entites.Transaction;


public interface TransactionService {
	public Transaction dtoToEntity(TransactionDto transactionDto ); 
	
	public String transactionSave(TransactionDto transactionDto);

}
