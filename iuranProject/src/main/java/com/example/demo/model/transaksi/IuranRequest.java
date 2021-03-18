package com.example.demo.model.transaksi;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

public class IuranRequest {
	
	public Integer idIuran;
	public String name;
	public String age;
	public String gender;
	public String address;
	public String religion;
	public String phone;
	public BigDecimal fee;
	public Date datePaid;
	public String statusPaid;
	public String period;
	public String idJenisPembayaran;
	public String idBank;

}
