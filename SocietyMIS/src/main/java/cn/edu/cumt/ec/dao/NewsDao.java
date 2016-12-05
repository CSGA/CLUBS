package cn.edu.cumt.ec.dao;

import java.util.List;

import cn.edu.cumt.ec.entity.News;

public interface NewsDao {
	public boolean add(News news);
	public boolean update(News oldNews,News newNews);
	public boolean delete(News news);
	public List<News> getAll();
	public News getById(int id);
}
