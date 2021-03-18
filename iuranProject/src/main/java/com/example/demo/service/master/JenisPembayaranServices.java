package com.example.demo.service.master;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.master.JenisPembayaran;
import com.example.demo.model.master.JenisPembayaranRequest;
import com.example.demo.model.master.JenisPembayaranResponse;
import com.example.demo.repository.master.JenisPembayaranRepository;

@Service
@Transactional
public class JenisPembayaranServices {

	@Autowired
	JenisPembayaranRepository jenisPembayaranRepository;
	
	public JenisPembayaranResponse getJenisPembayaran(JenisPembayaranRequest request) {
		JenisPembayaranResponse response = new JenisPembayaranResponse();
		response.status = "SUCCESS";
		
		List<JenisPembayaran> lsJenisPembayaran = new ArrayList<>();
		
		if (request.idJenisPembayaran == null && request.description == null) {
			lsJenisPembayaran = jenisPembayaranRepository.findByIdJenisPembayaranAndDescription(request.idJenisPembayaran, request.description);
		} else if (request.idJenisPembayaran != null && request.description == null) {
			lsJenisPembayaran = jenisPembayaranRepository.findByIdJenisPembayaran(request.idJenisPembayaran);
		} else if (request.idJenisPembayaran == null && request.description != null) {
			lsJenisPembayaran = jenisPembayaranRepository.findByDescription(request.description);
		}
		
		response.result = lsJenisPembayaran;
		return response;
		
	}
}
