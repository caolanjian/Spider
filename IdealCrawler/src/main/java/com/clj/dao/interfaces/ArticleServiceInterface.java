package com.clj.dao.interfaces;

import java.util.HashSet;

import com.clj.domain.Article;
import com.clj.domain.Articlecontent;
import com.clj.domain.Articlesubject;

public interface ArticleServiceInterface {

	public void saveArticle(Article article);
	
	public void saveArticleAndContentCascade(Article article, Articlecontent content);
	
	public void saveArticleAndSubjectCascade(Article article, HashSet<Articlesubject> subjects);
	
	public void saveArticleAndContentAndSubjectCascade(Article article, Articlecontent content, HashSet<Articlesubject> subjects);
}
