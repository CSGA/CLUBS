package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.ActivityDao;
import cn.edu.cumt.ec.dao.ActivityDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Activity;

public class ActivityService {
	private static ActivityDaoJDBCImpl activityDao=new ActivityDaoJDBCImpl();

	public void setActivityDao(ActivityDaoJDBCImpl  activityDao) {
		this.activityDao = activityDao;
	}
	public boolean add(Activity activity){
	  return activityDao.add(activity);
	}
	public boolean update(Activity oldActivity,Activity newActivity){
		return activityDao.update(oldActivity,newActivity);
	}
	public boolean delete(Activity activity){
		return activityDao.delete(activity);
	}
	public   List<Activity> getAll(){
		return  activityDao.getAll();
	}
	public Activity getById(int club_id){
		return activityDao.getById(club_id);
	}
	public boolean Query(Activity activity){
		return activityDao.Query(activity);
	}
	public static List<Activity> getAll1() {
		// TODO Auto-generated method stub
		return activityDao.getAll1();
	}
	public Activity getById1(int activity_id, int club_id) {
		// TODO Auto-generated method stub
		return activityDao.getById1(activity_id,club_id);
	}
	
}
