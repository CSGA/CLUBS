package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dao.ActivityDao;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Activity;
import cn.edu.cumt.ec.entity.Users;


public class ActivityDaoJDBCImpl  implements ActivityDao{
	//
	@Override
	public boolean add(Activity activity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into activity(`club_id`, `actname`, `acttime`, `actdesc`, `actlocation`) values(?,?,?,?,?)",new Object[]{activity.getClub_id(),activity.getActname(),activity.getActtime(),activity.getActdesc(),activity.getActlocation()});		
	}
	public boolean add3(Activity activity1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into activity(`club_id`, `actname`, `acttime`, `actdesc`, `actlocation`) values(?,?,?,?,?)",new Object[]{activity1.getClub_id(),activity1.getActname(),activity1.getActtime(),activity1.getActdesc(),activity1.getActlocation()});		
	}
	public boolean add1(Activity activity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into apply(club_id,students_id,applytime) values(?,?,?)",new Object[]{activity.getClub_id(),activity.getStudents_id(),activity.getApplytime()});		
	}
	public boolean add2(Activity activity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into joinact(students_id,activity_id,club_id) values(?,?,?)",new Object[]{activity.getStudents_id(),activity.getActivity_id(),activity.getClub_id()});		
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
				activity.setClub_id(rs.getInt(1));
				activity.setClub_name(rs.getString(2));
				activity.setSettime(rs.getString(3));
				activity.setClubdesc(rs.getString(4));
				activity.setClubimage(rs.getString(5));
				activity.setClubrule(rs.getString(6));
				activity.setClubemail(rs.getString(8));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activity;
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
	@Override
	public boolean Query(Activity activity) {
		ResultSet rs=DbUtil.executeQuery("select * from joinact where students_id=? and activity_id=?", new Object[]{activity.getStudents_id(),activity.getActivity_id()});
		Activity activity1=null;
		try{
			while(rs.next()){
				activity1=new Activity();
				activity1.setStudents_id(rs.getString(2));
				activity1.setActivity_id(rs.getInt(3));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(activity1!=null){
		  return true;
	    } 
	    else
	   {
		 return false;
	   }
	}
	public boolean Query2(Activity activity) {
		ResultSet rs=DbUtil.executeQuery("select * from club where club_id=? and clubpassword=?", new Object[]{activity.getClub_id(),activity.getClubpassword()});
		Activity activity1=null;
		try{
			while(rs.next()){
				activity1=new Activity();
				activity1.setClub_id(rs.getInt(1));
				activity1.setClubpassword(rs.getString(7));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(activity1!=null){
		  return true;
	    } 
	    else
	   {
		 return false;
	   }
	}
	
	public boolean Query1(Activity activity) {
		ResultSet rs=DbUtil.executeQuery("select * from apply where students_id=? and club_id=?", new Object[]{activity.getStudents_id(),activity.getClub_id()});
		Activity activity1=null;
		try{
			while(rs.next()){
				activity1=new Activity();
				activity1.setStudents_id(rs.getString(3));
				activity1.setClub_id(rs.getInt(2));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(activity1!=null){
		  return true;
	    } 
	    else
	   {
		 return false;
	   }
	}

    
	public Activity getById1(int activity_id,int club_id) {
		// TODO Auto-generated method stub
				ResultSet rs=DbUtil.executeQuery("select * from activity where activity_id=? and club_id=?", new Object[]{activity_id,club_id});
				Activity activity1=null;
				try{
					while(rs.next()){
						activity1=new Activity();
						activity1.setActivity_id(rs.getInt(1));
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
	public List<Activity> getById2(int club_id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from activity where club_id=?", new Object[]{club_id});
		List<Activity> activityList=new ArrayList<Activity>();
		Activity activity=null;
		try{
			while(rs.next()){
				activity=new Activity();
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
	public List<Activity> getById3(int club_id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from apply where club_id=?", new Object[]{club_id});
		List<Activity> activityList=new ArrayList<Activity>();
		Activity activity=null;
		try{
			while(rs.next()){
				activity=new Activity();
				activity.setStudents_id(rs.getString(3));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}

	public List<Activity> getAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Activity> getById4(int club_id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from students where students.students_id in(select distinct apply.students_id from apply where club_id=?)", new Object[]{club_id});
		List<Activity> activityList=new ArrayList<Activity>();
		Activity activity=null;
		try{
			while(rs.next()){
				activity=new Activity();
				activity.setStudents_email(rs.getString(8));
				activity.setStudents_school(rs.getString(5));
				activity.setStudents_id(rs.getString(1));
				activity.setStudents_class(rs.getString(6));
				activity.setStudents_sex(rs.getString(4));
				activity.setStudents_tel(rs.getString(7));
				activity.setStudents_name(rs.getString(2));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}
	public List<Activity> getClub() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from club where club_id <>?", new Object[]{1});
		List<Activity> activityList=new ArrayList<Activity>();
		try{
			while(rs.next()){
				Activity activity=new Activity();
				activity.setClub_name(rs.getString(2));
				activity.setClubdesc(rs.getString(4));
				activity.setClubemail(rs.getString(8));
				activity.setClubimage(rs.getString(5));
				activity.setSettime(rs.getString(3));
				activity.setClubman(rs.getString(9));
				activity.setClubmantel(rs.getString(10));
				activityList.add(activity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return activityList;
	}
	@Override
	public boolean update(Activity oldactivity,Activity newactivity) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update activity set actstatus=? where activity_id=?",new Object[]{newactivity.getActstatus(),oldactivity.getActivity_id()});
	}
	public List<Activity> getById5(int activity_id) {
		// TODO Auto-generated method stub
				ResultSet rs=DbUtil.executeQuery("select * from students where students.students_id in(select distinct joinact.students_id from joinact where activity_id=?)", new Object[]{7});
				List<Activity> activityList=new ArrayList<Activity>();
				Activity activity=null;
				try{
					while(rs.next()){
						activity=new Activity();
						activity.setStudents_email(rs.getString(8));
						activity.setStudents_school(rs.getString(5));
						activity.setStudents_id(rs.getString(1));
						activity.setStudents_class(rs.getString(6));
						activity.setStudents_sex(rs.getString(4));
						activity.setStudents_tel(rs.getString(7));
						activity.setStudents_name(rs.getString(2));
						activityList.add(activity);
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return activityList;
	}
	public List<Activity> getmyclub(String students_id) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from club where club.club_id in (select distinct apply.club_id from apply where students_id=?);", new Object[]{students_id});
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
	
	}
	

	


