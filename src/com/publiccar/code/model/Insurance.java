package com.publiccar.code.model;
// default package
// Generated 2018-5-23 12:46:47 by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Insurance generated by hbm2java
 */
@Entity
@Table(name = "insurance", catalog = "publiccar")
public class Insurance implements java.io.Serializable {

	private Integer insuranceId;
	private Integer carId;
	private Integer driverId;
	private String insuranceType;
	private String insuranceBegindate;
	private String insuranceEnddate;
	private String insuranceCompany;

	public Insurance() {
	}

	public Insurance(Integer carId, Integer driverId, String insuranceType, String insuranceBegindate,
			String insuranceEnddate, String insuranceCompany) {
		this.carId = carId;
		this.driverId = driverId;
		this.insuranceType = insuranceType;
		this.insuranceBegindate = insuranceBegindate;
		this.insuranceEnddate = insuranceEnddate;
		this.insuranceCompany = insuranceCompany;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "insurance_id", unique = true, nullable = false)
	public Integer getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	@Column(name = "car_id")
	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	@Column(name = "driver_id")
	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Column(name = "insurance_type", length = 100)
	public String getInsuranceType() {
		return this.insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	@Column(name = "insurance_begindate", length = 0)
	public String getInsuranceBegindate() {
		return this.insuranceBegindate;
	}

	public void setInsuranceBegindate(String insuranceBegindate) {
		this.insuranceBegindate = insuranceBegindate;
	}

	@Column(name = "insurance_enddate", length = 0)
	public String getInsuranceEnddate() {
		return this.insuranceEnddate;
	}

	public void setInsuranceEnddate(String insuranceEnddate) {
		this.insuranceEnddate = insuranceEnddate;
	}

	@Column(name = "insurance_company")
	public String getInsuranceCompany() {
		return this.insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

}
