package com.cashBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashBook.dtos.TransactionDto;
import com.cashBook.service.TransactionService;

@RestController
@RequestMapping("/trans")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@PostMapping("/transaction")
	public String saveEmployee(@RequestBody TransactionDto transactionDto) {
        System.out.println(transactionService.transactionSave(transactionDto));
		return transactionService.transactionSave(transactionDto);

	}

}
