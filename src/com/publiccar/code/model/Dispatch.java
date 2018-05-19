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
 * Dispatch generated by hbm2java
 */
@Entity
@Table(name = "dispatch", catalog = "publiccar")
public class Dispatch implements java.io.Serializable {

	private Integer dispatchId;
	private Integer carId;
	private String carmanName;
	private Date dispatchDate;

	public Dispatch() {
	}

	public Dispatch(Integer carId, String carmanName, Date dispatchDate) {
		this.carId = carId;
		this.carmanName = carmanName;
		this.dispatchDate = dispatchDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "dispatch_id", unique = true, nullable = false)
	public Integer getDispatchId() {
		return this.dispatchId;
	}

	public void setDispatchId(Integer dispatchId) {
		this.dispatchId = dispatchId;
	}

	@Column(name = "car_id")
	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	@Column(name = "carman_name", length = 100)
	public String getCarmanName() {
		return this.carmanName;
	}

	public void setCarmanName(String carmanName) {
		this.carmanName = carmanName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dispatch_date", length = 10)
	public Date getDispatchDate() {
		return this.dispatchDate;
	}

	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

}
