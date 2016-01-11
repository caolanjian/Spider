package com.clj.daoUtil;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateDaoUtil implements DaoUtil{

	private static SessionFactory sessionFactory;
	
	static
	{
		if(sessionFactory == null)
		{
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(sr);
		}
	}
	
	public HibernateDaoUtil()
	{
		
	}
	
	public static SessionFactory getMySessionFactory()
	{
		if(sessionFactory == null)
		{
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(sr);
		}
		return sessionFactory;
	}
	
	public boolean addObject(Object obj) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			session.save(obj);
			ts.commit();
			return true;
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			return false;
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
		}
	}

	public boolean deleteObject(Object obj) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			session.delete(obj);
			ts.commit();
			return true;
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			return false;
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
		}		
	}

	public boolean updateObject(Object obj) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			session.update(obj);
			ts.commit();
			return true;
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			return false;
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
		}
	}

	public Object getSingleObject(Class<?> arg, Serializable id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Object obj = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			obj = session.get(arg, id);
			ts.commit();
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
		}
		return obj;
	}

	@SuppressWarnings("unchecked")
	public List<?> queryObject(String hql, int offset, int pagesize, Object... values) {
		// TODO Auto-generated method stub
		Session session   = null;
		Transaction ts    = null;
		List<Object> list = null;
		Query query       = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts      = session.beginTransaction();
			query   = session.createQuery(hql);
			
			for (int i = 0; i < values.length; i++) {  
				 query.setParameter(i, values[i]);
			}
			System.out.print(query.toString());
			if(0 == pagesize)
			{
				list = query.list();
			}
			else
			{
				list  = query.setFirstResult(offset).setMaxResults(pagesize).list();
			}
						
			ts.commit();
			return list;
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			return null;
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<?> queryBySql(String hql, Object... parameters) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		List<Object> list = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			Query query = session.createQuery(hql);
			if(parameters!=null)
			{
				for(int i=0; i<parameters.length; i++)
				{
					query.setParameter(i, parameters[i]);
				}
			}
			list = query.list();
			ts.commit();
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
			
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<?> queryBySql(String hql, Map parasMap) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		List<Object> list = null;
		try
		{
			session = getMySessionFactory().openSession();
			ts = session.beginTransaction();
			Query query = session.createQuery(hql);
			if(parasMap!=null)
			{
				Set<String> parasNameSet = parasMap.keySet();
				for(String paraName : parasNameSet)
				{
					query.setParameter(paraName, parasMap.get(paraName));
				}
			}
			list = query.list();
			ts.commit();
		}
		catch(Exception e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
		}
		finally
		{
			if(session!=null && session.isOpen())
			{
				session.close();
			}
			
		}
		return list;
	}

}
