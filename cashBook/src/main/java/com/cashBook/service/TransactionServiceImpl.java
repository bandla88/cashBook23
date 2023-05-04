package com.cashBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashBook.dtos.TransactionDto;
import com.cashBook.entites.Transaction;
import com.cashBook.repos.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Transaction dtoToEntity(TransactionDto transactionDto) {
		Transaction transaction=new Transaction();
		transaction.setTransactionId(transactionDto.getTransactionId());
		transaction.setTransactionType(transactionDto.getTransactionType());
		transaction.setTransactionRemark(transactionDto.getTransactionRemark());
		transaction.setTransactionAmount(transactionDto.getTransactionAmount());
		transaction.setData(transactionDto.getData());
		
		
		
		return transaction;
	}

	@Override
	public String transactionSave(TransactionDto transactionDto) {
		
		Transaction pretransaction=dtoToEntity(transactionDto);
		Transaction posttransaction = transactionRepository.save(pretransaction);
		
		return posttransaction.getTransactionId();
	}

}
