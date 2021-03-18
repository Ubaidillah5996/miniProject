package com.example.demo.repository.master;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.master.PeriodePembayaran;


public interface PeriodRepository extends CrudRepository <PeriodePembayaran,String> {
	
	List<PeriodePembayaran> findByIdPeriodAndDescription(String idPeriod, String description);
	List<PeriodePembayaran> findByIdPeriod(String idPeriod);
	List<PeriodePembayaran> findByDescription(String description);

}
