package com.clj.dao.services;

import java.io.Serializable;

import com.clj.dao.interfaces.SubjectServiceInterface;
import com.clj.daoUtil.HibernateDaoUtil;
import com.clj.domain.Subject;

public class SubjectService implements SubjectServiceInterface{

	private HibernateDaoUtil hibernateUtil;
	
	public SubjectService()
	{
		hibernateUtil = new HibernateDaoUtil();
	}
	
	public Subject getSubjectByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Subject where subjectname=?";
		return (Subject)hibernateUtil.queryBySql(hql, name).get(0);
	}

	public Subject getSubjectById(Serializable id) {
		// TODO Auto-generated method stub
		return (Subject)hibernateUtil.getSingleObject(Subject.class, id);
	}

}
