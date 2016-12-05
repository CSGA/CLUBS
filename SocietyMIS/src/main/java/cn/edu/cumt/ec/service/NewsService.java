package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.NewsDao;
import cn.edu.cumt.ec.entity.News;

public class NewsService {
	public NewsService() {
		super();
	}
	private NewsDao newsDao;

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	
	public NewsService(NewsDao newsDao){
		this.newsDao = newsDao;
	}
	public boolean add(News news){
		return newsDao.add(news);
	}
	public boolean update(News oldNews,News newNews){
		return newsDao.update(oldNews, newNews);
	}
	public boolean delete(News news){
		return newsDao.delete(news);
	}
	public List<News> getAll(){
		return newsDao.getAll();
	}
	public News getById(int id){
		return newsDao.getById(id);
	}
}
