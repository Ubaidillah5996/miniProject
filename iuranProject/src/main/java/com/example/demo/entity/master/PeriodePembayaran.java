package com.example.demo.entity.master;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PeriodePembayaran {
	
	@Id
	@Column
	private String idPeriod;
	
	@Column
	private String description;
	
	@Column
	private Date createdDt;
	
	@Column
	private String createdBy;
	
	@Column
	private Date modifiedDt;
	
	@Column
	private String modifiedBy;

	
	public String getIdPeriod() {
		return idPeriod;
	}

	public void setIdPeriod(String idPeriod) {
		this.idPeriod = idPeriod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
