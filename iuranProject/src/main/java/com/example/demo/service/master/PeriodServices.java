package com.example.demo.service.master;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.master.PeriodePembayaran;
import com.example.demo.model.master.PeriodRequest;
import com.example.demo.model.master.PeriodResponse;
import com.example.demo.repository.master.PeriodRepository;

@Service
@Transactional
public class PeriodServices {

	@Autowired
	PeriodRepository periodRepository;
	
	public PeriodResponse getPeriod(PeriodRequest request) {
		PeriodResponse response = new PeriodResponse();
		response.status = "SUCCESS";
		
		List<PeriodePembayaran> lsPeriod = new ArrayList<>();
		
		if (request.idPeriod == null && request.description == null) {
			lsPeriod = periodRepository.findByIdPeriodAndDescription(request.idPeriod, request.description);
		} else if (request.idPeriod != null && request.description == null) {
			lsPeriod = periodRepository.findByIdPeriod(request.idPeriod);
		} else if (request.idPeriod == null && request.description != null) {
			lsPeriod = periodRepository.findByDescription(request.description);
		}
		
		response.result = lsPeriod;
		return response;
		
	}
}
