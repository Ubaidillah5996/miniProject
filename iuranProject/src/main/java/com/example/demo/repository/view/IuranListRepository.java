package com.example.demo.repository.view;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.transaksi.Iuran;
import com.example.demo.entity.transaksi.IuranTelat;
import com.example.demo.entity.view.IuranList;

public interface IuranListRepository extends CrudRepository <IuranList,Integer> {
	
	List<IuranList> findByName(String name);

}
