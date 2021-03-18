package com.example.demo.controller.transaksi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.transaksi.IuranRequest;
import com.example.demo.model.transaksi.IuranResponse;
import com.example.demo.service.transaksi.IuranServices;

@Controller
public class IuranController {

	@Autowired
	IuranServices iuranServices;
	
	@RequestMapping("api/iuran/save")
	public IuranResponse get(@RequestBody IuranRequest request) {
		IuranResponse response = iuranServices.createIuran(request);
		return response;
	} 
}
 