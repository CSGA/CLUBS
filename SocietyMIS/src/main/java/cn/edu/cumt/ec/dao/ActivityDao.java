package cn.edu.cumt.ec.dao;

import java.util.List;

import cn.edu.cumt.ec.entity.Activity;

public interface ActivityDao {
	boolean add(Activity activity);

	boolean update(Activity oldActivity, Activity newActivity);

	boolean delete(Activity activity);

	Activity getById(int id);

	List<Activity> getAll();

	boolean Query(Activity activity);



	

	
}
