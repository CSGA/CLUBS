package cn.edu.cumt.ec.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.ActivityDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Activity;
import cn.edu.cumt.ec.service.ActivityService;



public class UnionAction extends ActionSupport{
	  private int club_id;
	  private int activity_id;
      public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	
	
	
	//社团展示    
	public String clubshow() throws Exception{
		ActivityService activityService=new ActivityService();
		List<Activity> list=activityService.getAll();
		ActionContext.getContext().getSession().put("unionList", list);
		return "union1";
}
	//活动展示
	public String activityshow() throws Exception{
		@SuppressWarnings("unused")
		ActivityService activityService=new ActivityService();
		List<Activity> list=ActivityService.getAll1();
		ActionContext.getContext().getSession().put("activityList", list);
		return "activity1";
}
	//活动详情
	public String activityshow1()throws Exception{
		ActivityService activityService=new ActivityService();
		Activity activity1=activityService.getById1(activity_id,club_id);
		Activity activity2=activityService.getById(club_id);
		ActionContext.getContext().getSession().put("activity", activity1);
		ActionContext.getContext().getSession().put("activitys", activity2);
	    return "activity3";	   
	}
	//社团详情
	public String clubdetails()throws Exception{
		ActivityService activityService=new ActivityService();
		Activity union=activityService.getById(club_id);
		ActionContext.getContext().getSession().put("union", union);
	    return "union2";	   
	}
	//申请活动
	//报名活动
	//报社团名单展示
	//包活动名单展示
	//社团添加活动
	//社团删除活动
	//活动管理
	//同意活动申请
	//同意活动报名
}
