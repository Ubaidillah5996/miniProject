package com.example.demo.repository.master;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.master.JenisPembayaran;

public interface JenisPembayaranRepository extends CrudRepository <JenisPembayaran,String> {
	
	List<JenisPembayaran> findByIdJenisPembayaran(String idJenisPembayaran);
	List<JenisPembayaran> findByIdJenisPembayaranAndDescription(String idJenisPembayaran, String description);
	List<JenisPembayaran> findByDescription(String description);

}
