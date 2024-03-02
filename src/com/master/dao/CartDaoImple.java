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

import com.master.dto.Cart;
import com.master.dto.Medicine;


@Repository
public class CartDaoImple implements CartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addToCart(Cart cart) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {
			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(cart);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}


	@Override
	public void deleteFromCart(short cartId) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Cart(cartId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
		
	}
	
	@Override
	public List<Cart> selectAll(int userId) {

		List<Cart> cartList = hibernateTemplate.execute(new HibernateCallback<List<Cart>>() {
			@Override
			public List<Cart> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Cart where userId = ?");
				q.setInteger(0,userId);
				List<Cart> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return cartList;
	}


	@Override
	public void deleteAll(int userId) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
//				session.delete(new Cart(userId).getUserId());	
				Query q = session.createQuery("delete Cart where userId = ?");
				q.setInteger(0, userId);
				q.executeUpdate();
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

}
