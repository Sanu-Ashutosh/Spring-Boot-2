package com.nit.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "REST_TOURIST")
public class Tourist implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tId;
	@Column(length = 30)
	@Nonnull
	private String tName;
	@Column(length = 30)
	@Nonnull
	private String tAdd;
	@Column(length = 20)
	@Nonnull
	private String packageType;
	@Nonnull
	private Integer budget;
	@Nonnull
	private LocalDateTime stDate;
	@Nonnull
	private LocalDateTime edDate;
	public Tourist() {
		// TODO Auto-generated constructor stub
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettAdd() {
		return tAdd;
	}
	public void settAdd(String tAdd) {
		this.tAdd = tAdd;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public LocalDateTime getStDate() {
		return stDate;
	}
	public void setStDate(LocalDateTime stDate) {
		this.stDate = stDate;
	}
	public LocalDateTime getEdDate() {
		return edDate;
	}
	public void setEdDate(LocalDateTime edDate) {
		this.edDate = edDate;
	}
	@Override
	public String toString() {
		return "Tourist [tId=" + tId + ", tName=" + tName + ", tAdd=" + tAdd + ", packageType=" + packageType
				+ ", budget=" + budget + ", stDate=" + stDate + ", edDate=" + edDate + "]";
	}
	public Tourist(Integer tId, String tName, String tAdd, String packageType, Integer budget, LocalDateTime stDate,
			LocalDateTime edDate) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tAdd = tAdd;
		this.packageType = packageType;
		this.budget = budget;
		this.stDate = stDate;
		this.edDate = edDate;
	}
	
}
 