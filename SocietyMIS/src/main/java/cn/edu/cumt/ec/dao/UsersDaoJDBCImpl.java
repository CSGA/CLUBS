package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dbutil.DbUtil;

import cn.edu.cumt.ec.entity.Users;

public class UsersDaoJDBCImpl implements UsersDao{
//	×¢²á
	@Override
	public boolean add(Users users) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into students values(?,?,?,?,?,?,?,?)",new Object[]{users.getStudents_id(),users.getStudents_name(),users.getStudents_password(),users.getStudents_sex(),users.getStudents_school(),users.getStudents_class(),users.getStudents_tel(),users.getStudents_email()});		
	}
	@Override
	//µÇÂ¼
	public  boolean  Query(Users users){
		ResultSet rs=DbUtil.executeQuery("select * from students where students_password=? and students_id=?", new Object[]{users.getStudents_password(),users.getStudents_id()});
		Users users1=null;
		try{
			while(rs.next()){
				users1=new Users();
				users1.setStudents_id(rs.getString(1));
				users1.setStudents_password(rs.getString(3));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(users1!=null){
		  return true;
	    } 
	    else
	   {
		 return false;
	   }
	  }
	@Override
	public boolean update(Users oldUsers,Users newUsers) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update news_inf set news_Students_id=?,news_title=? where news_Students_number=?",new Object[]{newUsers.getStudents_id(),newUsers.getStudents_id(),oldUsers.getStudents_id()});
	}

	@Override
	public boolean delete(Users users) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from news_inf where news_Students_number=?)",new Object[]{});
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from news_inf", new Object[]{});
		List<Users> usersList=new ArrayList<Users>();
		try{
			while(rs.next()){
				Users users=new Users();
				users.setStudents_id(rs.getString(1));
				usersList.add(users);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return usersList;
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from news_inf where news_Students_number=?", new Object[]{});
		Users users=null;
		try{
			while(rs.next()){
				users=new Users();
				users.setStudents_id(rs.getString(1));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return users;
	}



}
