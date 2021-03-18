package com.example.demo.service.master;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.master.Bank;
import com.example.demo.model.master.BankRequest;
import com.example.demo.model.master.BankResponse;
import com.example.demo.repository.master.BankRepository;

@Service
@Transactional
public class BankServices {

	@Autowired
	BankRepository bankRepository;
	
	public BankResponse getBank(BankRequest request) {
		BankResponse response = new BankResponse();
		response.status = "SUCCESS";
		
		List<Bank> lsBank = new ArrayList<>();
		
		if (request.idBank == null && request.description == null) {
			lsBank = bankRepository.findByIdBankAndDescription(request.idBank, request.description);
		} else if (request.idBank != null && request.description == null) {
			lsBank = bankRepository.findByIdBank(request.idBank);
		} else if (request.idBank == null && request.description != null) {
			lsBank = bankRepository.findByDescription(request.description);
		}
		
		response.result = lsBank;
		return response;
		
	}
}
