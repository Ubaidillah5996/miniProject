package com.example.demo.repository.master;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.master.Bank;

public interface BankRepository extends CrudRepository <Bank,String> {
	
	List<Bank> findByIdBank(String idBank);
	List<Bank> findByIdBankAndDescription(String idBank, String description);
	List<Bank> findByDescription(String description);

}
