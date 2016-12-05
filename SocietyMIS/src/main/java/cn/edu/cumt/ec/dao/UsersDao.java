package cn.edu.cumt.ec.dao;

import java.util.List;

import cn.edu.cumt.ec.entity.Users;

public interface UsersDao {

	boolean add(Users Users);

	boolean update(Users oldUsers, Users newUsers);

	boolean delete(Users users);

	Users getById(int id);

	List<Users> getAll();

	boolean Query(Users users);

}
