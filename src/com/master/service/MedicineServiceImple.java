package com.master.service;

import java.util.List;

import com.master.dto.Medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.dao.MedicineDao;

@Service
public class MedicineServiceImple implements MedicineService {

	@Autowired
	private MedicineDao medicineDao; 
	
	@Override
	public void addMedicine(Medicine medicine) {

		medicineDao.insertMedicine(medicine);
		
	}

	@Override
	public void removeMedicine(int medicineId) {

		medicineDao.deleteMedicine(medicineId);
		
	}

	@Override
	public void modifyMedicine(Medicine medicine) {
		
		medicineDao.updateMedicine(medicine);
	}

	@Override
	public List<Medicine> ListMedicine() {
	
		return medicineDao.selectAll();
	}

	@Override
	public Medicine selectMedicine(int medicineId) {
		
		
		return medicineDao.findMedicine(medicineId);
	}

	@Override
	public Medicine findMedicineByName(String medicineName) {


		return medicineDao.getByName(medicineName);
		
	}

	
	
	
	
}
