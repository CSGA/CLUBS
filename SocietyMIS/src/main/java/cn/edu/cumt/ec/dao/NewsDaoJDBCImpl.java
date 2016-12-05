package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.News;

public class NewsDaoJDBCImpl implements NewsDao {

	@Override
	public boolean add(News news) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into news_inf values(?,?)",new Object[]{news.getId(),news.getTitle()});		
	}

	@Override
	public boolean update(News oldNews,News newNews) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update news_inf set news_id=?,news_title=? where news_id=?",new Object[]{newNews.getId(),newNews.getTitle(),oldNews.getId()});
	}

	@Override
	public boolean delete(News news) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from news_inf where news_id=?)",new Object[]{news.getId()});
	}

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from news_inf", new Object[]{});
		List<News> newsList=new ArrayList<News>();
		try{
			while(rs.next()){
				News news=new News();
				news.setId(rs.getInt(1));
				news.setTitle(rs.getString(2));
				newsList.add(news);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return newsList;
	}

	@Override
	public News getById(int id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from news_inf where news_id=?", new Object[]{id});
		News news=null;
		try{
			while(rs.next()){
				news=new News();
				news.setId(rs.getInt(1));
				news.setTitle(rs.getString(2));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return news;
	}

}
