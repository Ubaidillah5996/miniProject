package com.example.demo.model.transaksi;

import java.math.BigDecimal;
import java.util.Date;

public class IuranTelatRequest {
	
	public Integer idIuranTelat;
	public Integer idIuran;
	public String name;
	public String address;
	public String phone;
	public BigDecimal fee;
	public Date datePaid;
	public String statusPaid;
	public String reason;
	public Date estimatedDatePaid;
	public String period;
	public String idJenisPembayaran;
	public String idBank;

}
