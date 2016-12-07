package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dao.ActivityDao;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Activity;


public class ActivityDaoJDBCImpl  implements ActivityDao{
	@Override
	public boolean add(Activity activity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into activity(`club_id`, `actname`, `acttime`, `actdesc`, `actlocation`) values(?,?,?,?,?)",new Object[]{activity.getClub_id(),activity.getActname(),activity.getActtime(),activity.getActdesc(),activity.getActlocation()});		
	}

	@Override
	public boolean update(Activity oldactivity,Activity newactivity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update activity_inf set activity_id=?,activity_title=? where activity_id=?",new Object[]{});
	}

	@Override
	public boolean delete(Activity activity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from activity_inf where activity_id=?)",new Object[]{activity});
	}

	@Override
	public List<Activity> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from club", new Object[]{});
		List<Activity> activityList=new ArrayList<Activity>();
		try{
			while(rs.next()){
				Activity activity=new Activity();
				activity.setClub_id(rs.getInt(1));
				activity.setClub_name(rs.getString(2));
				activity.setSettime(rs.getString(3));
				activity.setClubdesc(rs.getString(4));
				activity.setClubimage(rs.getString(5));
				activity.setClubrule(rs.getString(6));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}

	@Override
	public Activity getById(int club_id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from club where club_id=?", new Object[]{club_id});
		Activity activity=null;
		try{
			while(rs.next()){
				activity=new Activity();
				activity.setClub_name(rs.getString(2));
				activity.setSettime(rs.getString(3));
				activity.setClubdesc(rs.getString(4));
				activity.setClubimage(rs.getString(5));
				activity.setClubrule(rs.getString(6));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activity;
	}

	@Override
	public boolean Query(Activity activity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Activity> getAll1() {
		ResultSet rs=DbUtil.executeQuery("select * from activity", new Object[]{});
		List<Activity> activityList=new ArrayList<Activity>();
		try{
			while(rs.next()){
				Activity activity=new Activity();
				activity.setActivity_id(rs.getInt(1));
				activity.setClub_id(rs.getInt(2));
				activity.setActname(rs.getString(3));
				activity.setActtime(rs.getString(4));
				activity.setActdesc(rs.getString(5));
				activity.setActlocation(rs.getString(6));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}

	public Activity getById1(int activity_id,int club_id) {
		// TODO Auto-generated method stub
				ResultSet rs=DbUtil.executeQuery("select * from activity where activity_id=? and club_id=?", new Object[]{activity_id,club_id});
				Activity activity1=null;
				try{
					while(rs.next()){
						activity1=new Activity();
						activity1.setClub_id(rs.getInt(2));
						activity1.setActname(rs.getString(3));
						activity1.setActtime(rs.getString(4));
						activity1.setActdesc(rs.getString(5));
						activity1.setActlocation(rs.getString(6));
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return activity1;
	}

	
	
	
	
	
	public List<Activity> getAllActivity() {
		ResultSet rs=DbUtil.executeQuery("select * from activity where actstatus=?", new Object[]{"´ýÉóºË"});
		List<Activity> activityList=new ArrayList<Activity>();
		try{
			while(rs.next()){
				Activity activity=new Activity();
				activity.setActivity_id(rs.getInt(1));
				activity.setClub_id(rs.getInt(2));
				activity.setActname(rs.getString(3));
				activity.setActtime(rs.getString(4));
				activity.setActdesc(rs.getString(5));
				activity.setActlocation(rs.getString(6));
				activity.setActstatus(rs.getString(7));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}
	
	public List<Activity> getPassActivity() {
		ResultSet rs=DbUtil.executeQuery("select * from activity where actstatus=?", new Object[]{"ÉóºËÍ¨¹ý"});
		List<Activity> activityList=new ArrayList<Activity>();
		try{
			while(rs.next()){
				Activity activity=new Activity();
				activity.setActivity_id(rs.getInt(1));
				activity.setClub_id(rs.getInt(2));
				activity.setActname(rs.getString(3));
				activity.setActtime(rs.getString(4));
				activity.setActdesc(rs.getString(5));
				activity.setActlocation(rs.getString(6));
				activity.setActstatus(rs.getString(7));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}
	
	

}
