package com.clj.dao.interfaces;

import java.io.Serializable;

import com.clj.domain.Subject;

public interface SubjectServiceInterface {

	public Subject getSubjectByName(String name);
	
	public Subject getSubjectById(Serializable id);
}
