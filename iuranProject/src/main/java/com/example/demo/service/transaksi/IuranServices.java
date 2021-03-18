package com.example.demo.service.transaksi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.transaksi.Iuran;
import com.example.demo.entity.transaksi.IuranTelat;
import com.example.demo.model.transaksi.IuranRequest;
import com.example.demo.model.transaksi.IuranResponse;
import com.example.demo.model.transaksi.IuranTelatRequest;
import com.example.demo.model.transaksi.IuranTelatResponse;
import com.example.demo.repository.transaksi.IuranRepository;
import com.example.demo.repository.transaksi.IuranTelatRepository;
import com.google.gson.Gson;

@Service
@Transactional
public class IuranServices {
	
	Gson g = new Gson();
	
	@Autowired
	IuranRepository iuranRepository;
	
	@Autowired
	IuranTelatRepository iuranTelatRepository;

	public IuranResponse createIuran(IuranRequest request) {
		IuranResponse response = new IuranResponse();
		response.status = "SUCCESS";
		
		Iuran iuran = new Iuran();
		//SAVE FROM REQUEST
		iuranRepository.save(iuran);
		
		response.result = iuran.getIdIuran();
		return response;
	}
	
	public IuranTelatResponse createIuranTelat(IuranTelatRequest request) {
		IuranTelatResponse response = new IuranTelatResponse();
		response.status = "SUCCESS";
		
		IuranTelat iuranTelat = new IuranTelat();
		//SAVE FROM REQUEST
		iuranTelatRepository.save(iuranTelat);
		
		response.result = iuranTelat.getIdIuranTelat();
		return response;
	}
}
