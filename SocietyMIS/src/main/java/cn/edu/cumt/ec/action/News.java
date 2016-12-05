package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.NewsDaoJDBCImpl;
import cn.edu.cumt.ec.service.NewsService;

public class News extends ActionSupport {
	private NewsService newsService=new NewsService();
	private int news_id;
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public NewsService getNewsService() {
		return newsService;
	}
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	@Override
	public String execute() throws Exception{
		NewsDaoJDBCImpl newsDaoJDBCImpl=new NewsDaoJDBCImpl();
		newsService.setNewsDao(newsDaoJDBCImpl);
		if(newsService.getById(getNews_id())!=null){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
