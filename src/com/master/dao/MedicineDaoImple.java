package com.master.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.master.dto.Medicine;

@Repository
public class MedicineDaoImple implements MedicineDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertMedicine(Medicine medicine) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(medicine);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}


	@Override
	public void deleteMedicine(int MedicineId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Medicine(MedicineId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(medicine);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public List<Medicine> selectAll() {

		List<Medicine> expList = hibernateTemplate.execute(new HibernateCallback<List<Medicine>>() {

			@Override
			public List<Medicine> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Medicine");
				List<Medicine> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return expList;
	}
	
	@Override
	public Medicine findMedicine(int medicineId) {
		Medicine medicine = hibernateTemplate.execute(new HibernateCallback<Medicine>() {

			@Override
			public Medicine doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Medicine ex = (Medicine)session.get(Medicine.class,medicineId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return medicine;
	}


	@Override
	public Medicine getByName(String medicineName) {
		Medicine medicine = hibernateTemplate.execute(new HibernateCallback<Medicine>() {

			@Override
			public Medicine doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Medicine ex = (Medicine)session.get(Medicine.class,medicineName);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return medicine;
	}
	
	

}
