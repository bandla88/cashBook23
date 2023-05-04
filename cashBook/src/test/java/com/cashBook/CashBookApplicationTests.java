package com.cashBook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cashBook.dtos.TransactionDto;
import com.cashBook.entites.Transaction;
import com.cashBook.repos.TransactionRepository;
import com.cashBook.service.TransactionService;

@SpringBootTest
class CashBookApplicationTests{
	@Autowired
	TransactionRepository repo;
	@Autowired
	TransactionService service;
	
	


	@Test
	void contextLoads() {
	}
	@Test
	void testRepoConnection() {
		Transaction trans=new Transaction();
		trans.setTransactionAmount(23);
		trans.setTransactionType("EXPENSE");
		trans.setTransactionRemark("miscellneous");
		trans.setTransactionDate(null);
		trans.setData(null);
		
		repo.save(trans);
		
	}
	@Test
	void testRepoConnectionsavingTransactionTypeNull() {
		Transaction trans=new Transaction();
		trans.setTransactionAmount(23);
		//trans.setTransactionType(null);
		trans.setTransactionRemark("miscellneous");
		trans.setTransactionDate(null);
		trans.setData(null);
		
		repo.save(trans);
		
	}
	@Test
	void testSaveTrnsactionService() {
		TransactionDto transactionDto=new TransactionDto();
		transactionDto.setTransactionAmount(25);
		transactionDto.setTransactionRemark("Panipuri");
		transactionDto.setTransactionType("Expense");
		
		System.out.println(service.transactionSave(transactionDto));
		
		
		
		
	}

}
