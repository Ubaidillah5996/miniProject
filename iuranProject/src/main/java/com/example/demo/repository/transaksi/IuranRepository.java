package com.example.demo.repository.transaksi;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.transaksi.Iuran;

public interface IuranRepository extends CrudRepository <Iuran,Integer> {
	
	Iuran findByIuran(Integer idIuran);

}
