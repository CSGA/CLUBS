package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.ActivityDao;
import cn.edu.cumt.ec.dao.ActivityDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Activity;
import cn.edu.cumt.ec.entity.Users;

public class ActivityService {
	private static ActivityDaoJDBCImpl activityDao=new ActivityDaoJDBCImpl();

	public void setActivityDao(ActivityDaoJDBCImpl  activityDao) {
		this.activityDao = activityDao;
	}
	public boolean add(Activity activity){
	  return activityDao.add(activity);
	}
	public boolean add1(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.add1(activity);
	}
	public boolean add2(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.add2(activity);
	}
	public boolean add3(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.add3(activity);
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
	public boolean Query1(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.Query1(activity);
	}
	public Activity getById1(int activity_id, int club_id) {
		// TODO Auto-generated method stub
		return activityDao.getById1(activity_id,club_id);
	}
	@SuppressWarnings("unchecked")
	public static List<Activity> getById2(int club_id) {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.getById2(club_id);
	}
	public List<Activity> getById3(int club_id) {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.getById3(club_id);
	}
	public List<Activity> getById4(int club_id) {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.getById4(club_id);
	}
	public List<Activity> getAll2() {
		// TODO Auto-generated method stub
		return activityDao.getAll2();
	}
	public static List<Activity> getPassActivity() {
		// TODO Auto-generated method stub
		return activityDao.getPassActivity();
	}
	public  List<Activity> getAllActivity() {
		// TODO Auto-generated method stub
		return activityDao.getAllActivity();
	}
	public boolean Query2(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.Query2(activity);
	}
	public List<Activity> getClub() {
		// TODO Auto-generated method stub
		return activityDao.getClub();
	}
	public List<Activity> getById5(int activity_id) {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.getById5(activity_id);
	}
	public List<Activity> getmyclub(String students_id) {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.getmyclub(students_id);
	}
	
	
	
	
	
	
	
}
