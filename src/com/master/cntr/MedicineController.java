package com.master.cntr;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.master.dto.Medicine;

import com.master.service.MedicineService;


@Controller
public class MedicineController {

	
	@Autowired
	private MedicineService medicineService;
	
	@RequestMapping(value ="/prep_medicine_add_form.htm", method = RequestMethod.GET)
	public String prepMedicineAddForm(ModelMap map) {
		
		map.put("medicine", new Medicine());
		return "medicine_add_form";	
		
	}
	
	@RequestMapping(value = "/medicine_add.htm",method = RequestMethod.POST)
	public String expenseAdd(Medicine medicine) {
		
		medicineService.addMedicine(medicine);
		return "AdminHome";
	}
	
	@RequestMapping(value = "/medicine_list.htm",method = RequestMethod.GET)
	public String allExpenses(ModelMap map) {
		List<Medicine> li = medicineService.ListMedicine();
		map.put("medicineList", li);
		return "medicine_list";
	}
	
	
	@RequestMapping(value = "/medicine_delete.htm",method = RequestMethod.GET)
	
	public String medicineDelete(@RequestParam int medicineId,ModelMap map) {
		
		medicineService.removeMedicine(medicineId);
		
		List<Medicine> li = medicineService.ListMedicine();
		map.put("medicineList",li);
		return "medicine_list";
		
		
	}
	
	@RequestMapping(value = "/medicine_update_form.htm",method = RequestMethod.GET)
	
	public String medicineUpdate(@RequestParam int medicineId, ModelMap map) {
		
		Medicine medicine = medicineService.selectMedicine(medicineId);
	
		map.put("medicine", medicine);
		
		return "medicine_update_form";
		
	}
	
	
	@RequestMapping(value = "/medicine_update.htm",method = RequestMethod.POST)
	
	public String Update(Medicine medicine,ModelMap map) {
	
		medicineService.modifyMedicine(medicine);
		
		List<Medicine> li = medicineService.ListMedicine();
		map.put("medicineList",li);
		return "medicine_list";
		
		
		
		
	}
	
	
	
}
