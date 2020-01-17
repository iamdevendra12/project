package com.app.dao;





import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.ServiceProvider;
import com.app.pojos.User;
import com.app.pojos.UserRole;


@Repository
@Transactional
public class SpDaoImpl implements ISpDao 
{
@Autowired
private SessionFactory sf;
	@Override
	public List<User> listofsp() {
		String jqpl = "select sp from User sp where sp.role=:rl";
		return sf.getCurrentSession().createQuery(jqpl, User.class).setParameter("rl", UserRole.SERVICEPROVIDER).getResultList();
	}
	
	

}
