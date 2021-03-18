package com.example.demo.repository.transaksi;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.transaksi.Iuran;
import com.example.demo.entity.transaksi.IuranTelat;

public interface IuranTelatRepository extends CrudRepository <IuranTelat,Integer> {
	
	IuranTelat findByIuranTelat(Integer idIuranTelat);

}
