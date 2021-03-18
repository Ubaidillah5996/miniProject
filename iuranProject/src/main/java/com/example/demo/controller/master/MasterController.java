package com.example.demo.controller.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.master.BankRequest;
import com.example.demo.model.master.BankResponse;
import com.example.demo.model.master.JenisPembayaranRequest;
import com.example.demo.model.master.JenisPembayaranResponse;
import com.example.demo.model.master.PeriodRequest;
import com.example.demo.model.master.PeriodResponse;
import com.example.demo.service.master.BankServices;
import com.example.demo.service.master.JenisPembayaranServices;
import com.example.demo.service.master.PeriodServices;

@Controller
public class MasterController {

	@Autowired
	BankServices bankServices;
	
	@Autowired
	JenisPembayaranServices jenisPembayaranServices;
	
	@Autowired
	PeriodServices periodServices;
	
	@RequestMapping("api/master/bank/get")
	public BankResponse get(@RequestBody BankRequest request) {
		BankResponse response = bankServices.getBank(request);
		return response;
	} 
	
	@RequestMapping("api/master/jenis-pembayaran/get")
	public JenisPembayaranResponse get(@RequestBody JenisPembayaranRequest request) {
		JenisPembayaranResponse response = jenisPembayaranServices.getJenisPembayaran(request);
		return response;
	} 
	
	@RequestMapping("api/master/period/get")
	public PeriodResponse get(@RequestBody PeriodRequest request) {
		PeriodResponse response = periodServices.getPeriod(request);
		return response;
	} 
}
 