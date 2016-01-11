package com.clj.daoUtil;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DaoUtil {

	public boolean addObject(final Object obj);

	public boolean deleteObject(final Object obj);

	public boolean updateObject(final Object obj);

	public Object getSingleObject(final Class<?> arg, final Serializable id);

	public List<?> queryObject(final String hql, final int offset, final int pagesize, final Object... values);

	public List<?> queryBySql(final String sql, final Object... parameters);
	
	public List<?> queryBySql(final String sql, final Map parasMap);
}
