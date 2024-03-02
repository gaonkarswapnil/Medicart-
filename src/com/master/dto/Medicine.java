package com.master.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Medicines")
public class Medicine {

	@Id
	@Column(name = "medicine_id")
	@GeneratedValue
	private int medicineId;
	
	@Column(name = "medicine_name")
	private String medicineName;
	
	@Column(name = "mfg_date")
	private String mfgDate;
	
	@Column(name = "exp_date")
	private String expDate;
	
	@Column(name ="price_per_unit")
	private String price;
	
	@Column(name ="rack_number")
	private String rackNumber;
	
	
	public Medicine() {
		super();
	}

	public Medicine(int medicineId) {
		
		super();
		this.medicineId = medicineId;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public Medicine(String medicineName) {
		super();
		this.medicineName = medicineName;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRackNumber() {
		return rackNumber;
	}

	public void setRackNumber(String rackNumber) {
		this.rackNumber = rackNumber;
	}
	
	
	
	
	
	
}
