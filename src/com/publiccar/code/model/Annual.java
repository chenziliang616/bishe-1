package com.publiccar.code.model;
// default package
// Generated 2018-5-19 23:06:20 by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Annual generated by hbm2java
 */
@Entity
@Table(name = "annual", catalog = "publiccar")
public class Annual implements java.io.Serializable {

	private Integer annualId;
	private Integer carId;
	private String annualContent;
	private Date annualDate;

	public Annual() {
	}

	public Annual(Integer carId, String annualContent, Date annualDate) {
		this.carId = carId;
		this.annualContent = annualContent;
		this.annualDate = annualDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "annual_id", unique = true, nullable = false)
	public Integer getAnnualId() {
		return this.annualId;
	}

	public void setAnnualId(Integer annualId) {
		this.annualId = annualId;
	}

	@Column(name = "car_id")
	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	@Column(name = "annual__content", length = 100)
	public String getAnnualContent() {
		return this.annualContent;
	}

	public void setAnnualContent(String annualContent) {
		this.annualContent = annualContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "annual__date", length = 10)
	public Date getAnnualDate() {
		return this.annualDate;
	}

	public void setAnnualDate(Date annualDate) {
		this.annualDate = annualDate;
	}

}
