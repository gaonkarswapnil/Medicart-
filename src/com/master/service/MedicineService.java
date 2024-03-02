package com.master.service;

import java.util.List;

import com.master.dto.Medicine;

public interface MedicineService {

	void addMedicine(Medicine medicine);
	void removeMedicine(int medicineId);
	Medicine selectMedicine(int medicineId);
	void modifyMedicine(Medicine medicine);
	List<Medicine> ListMedicine();
	Medicine findMedicineByName(String medicineName);
	
	
}
