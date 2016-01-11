package com.clj.dao.services;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.clj.dao.interfaces.ArticleServiceInterface;
import com.clj.daoUtil.HibernateDaoUtil;
import com.clj.domain.Article;
import com.clj.domain.Articlecontent;
import com.clj.domain.Articlesubject;

public class ArticleService implements ArticleServiceInterface{

	private HibernateDaoUtil hibernateUtil;
	
	public ArticleService()
	{
		hibernateUtil = new HibernateDaoUtil();
	}
	
	public void saveArticle(Article article) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = HibernateDaoUtil.getMySessionFactory().openSession();
			ts = session.beginTransaction();
			session.save(article);
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
	}

	public void saveArticleAndContentCascade(Article article,
			Articlecontent content) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = HibernateDaoUtil.getMySessionFactory().openSession();
			ts = session.beginTransaction();
			article.setArticlecontent(content);
			content.setArticle(article);
			session.save(article);
			session.save(content);
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
	}

	public void saveArticleAndSubjectCascade(Article article,
			HashSet<Articlesubject> subjects) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = HibernateDaoUtil.getMySessionFactory().openSession();
			ts = session.beginTransaction();
			article.setArticlesubjects(subjects);
			for(Articlesubject subject : subjects)
			{
				subject.setArticle(article);
				session.save(subject);
			}
			session.save(article);
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
	}

	public void saveArticleAndContentAndSubjectCascade(Article article,
			Articlecontent content, HashSet<Articlesubject> subjects) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try
		{
			session = HibernateDaoUtil.getMySessionFactory().openSession();
			ts = session.beginTransaction();
			article.setArticlesubjects(subjects);
			article.setArticlecontent(content);
			content.setArticle(article);
			for(Articlesubject subject : subjects)
			{
				subject.setArticle(article);
			}
			session.save(article);
			session.save(content);
/*			for(Articlesubject subject : subjects)
			{
				session.save(subject);
			}*/
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
	}

}
