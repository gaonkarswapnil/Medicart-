package com.master.dao;

import java.util.List;

import com.master.dto.Medicine;

public interface MedicineDao {

	void insertMedicine(Medicine medicine);
	void deleteMedicine(int medicineId);
	Medicine findMedicine(int medicineId);
	void updateMedicine(Medicine medicine);
	Medicine getByName(String medicineName); 
	List<Medicine> selectAll();

	
}
