package com.example.demo.entity.transaksi;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Iuran {
	
	@Id
	@Column
	private Integer idIuran;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	@Column
	private String gender;
	
	@Column
	private String address;
	
	@Column
	private String religion;
	
	@Column 
	private String phone;
	
	@Column
	private BigDecimal fee;

	@Column
	private Date datePaid;
	
	@Column
	private String statusPaid;
	
	@Column
	private String period;
	
	@Column
	private String idJenisPembayaran;
	
	@Column
	private String idBank;
	
	@Column
	private Date createdDt;
	
	@Column
	private String createdBy;
	
	@Column
	private Date modifiedDt;
	
	@Column
	private String modifiedBy;

	public Integer getIdIuran() {
		return idIuran;
	}

	public void setIdIuran(Integer idIuran) {
		this.idIuran = idIuran;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getIdJenisPembayaran() {
		return idJenisPembayaran;
	}

	public void setIdJenisPembayaran(String idJenisPembayaran) {
		this.idJenisPembayaran = idJenisPembayaran;
	}

	public String getIdBank() {
		return idBank;
	}

	public void setIdBank(String idBank) {
		this.idBank = idBank;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public Date getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}

	public String getStatusPaid() {
		return statusPaid;
	}

	public void setStatusPaid(String statusPaid) {
		this.statusPaid = statusPaid;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
