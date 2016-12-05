package cn.edu.cumt.ec.service;



import java.util.List;

import cn.edu.cumt.ec.dao.UsersDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Users;

public class UsersService {
	 private static UsersDaoJDBCImpl usersDao=new UsersDaoJDBCImpl();

		public void setUsersDao(UsersDaoJDBCImpl  usersDao) {
			this.usersDao = usersDao;
		}
		public boolean add(Users users){
		  return usersDao.add(users);
		}
		public boolean update(Users oldUsers,Users newUsers){
			return usersDao.update(oldUsers,newUsers);
		}
		public boolean delete(Users users){
			return usersDao.delete(users);
		}
		public   List<Users> getAll(){
			return  usersDao.getAll();
		}
		public Users getById(int id){
			return usersDao.getById(id);
		}
		public boolean Query(Users users){
			return usersDao.Query(users);
		}
}
