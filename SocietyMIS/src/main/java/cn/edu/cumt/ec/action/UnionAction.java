package cn.edu.cumt.ec.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.servlet.http.HttpServletRequest;



import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import cn.edu.cumt.ec.entity.Activity;
import cn.edu.cumt.ec.entity.Users;
import cn.edu.cumt.ec.service.ActivityService;
import cn.edu.cumt.ec.service.UsersService;




@SuppressWarnings("serial")
public class UnionAction extends ActionSupport{
	private String clubemail;
	private String clubpassword;
	private String actname;
	private String acttime;
	private String actlocation;
	private String actdesc;
	private int club_id;
	private int activity_id;
	private String students_id;
	private String  tip;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getActname() {
		return actname;
	}
	public void setActname(String actname) {
		this.actname = actname;
	}
	public String getActtime() {
		return acttime;
	}
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}
	public String getActlocation() {
		return actlocation;
	}
	public void setActlocation(String actlocation) {
		this.actlocation = actlocation;
	}
	public String getActdesc() {
		return actdesc;
	}
	public void setActdesc(String actdesc) {
		this.actdesc = actdesc;
	}
      public String getStudents_id() {
		return students_id;
	}
	public void setStudents_id(String students_id) {
		this.students_id = students_id;
	}
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
	public String getClubpassword() {
		return clubpassword;
	}
	public void setClubpassword(String clubpassword) {
		this.clubpassword = clubpassword;
	}
	public String getClubemail() {
		return clubemail;
	}
	public void setClubemail(String clubemail) {
		this.clubemail = clubemail;
	}
	
	//社团展示    
	public String clubshow() throws Exception{
		ActivityService activityService=new ActivityService();
		List<Activity> list=activityService.getAll();
		ActionContext.getContext().getSession().put("unionList", list);
		return "union1";
}
	//社团展示    
	public String myclub() throws Exception{
		ActivityService activityService=new ActivityService();
		List<Activity> list=activityService.getmyclub(students_id);
		ActionContext.getContext().getSession().put("myclubList", list);
		return "union3";
}
	//活动展示
	public String activityshow() throws Exception{
		@SuppressWarnings("unused")
		ActivityService activityService=new ActivityService();
		List<Activity> list=ActivityService.getPassActivity();
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
	//报名参加社团
	 public String applyclub() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest(); 
		ActivityService activityService=new ActivityService();
		Activity activity=new Activity();
		activity.setClub_id(club_id);
		activity.setStudents_id(students_id);
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dd =format.format(dt);
		activity.setApplytime(dd);
		if(activityService.Query1(activity)==true){
			request.setAttribute("errorMessage","您已报名参加该社团，请等待邮件通知");
            return "none1";
          }else{
        	activityService.add1(activity);
        	setTip("已");
        	request.setAttribute("errorMessage","您已报名成功，请等待邮件通知");
      		return "applyclub";
         }
}
	//报名加入活动
	 public String actjoin() throws Exception{
		 HttpServletRequest request = ServletActionContext.getRequest();  
	    ActivityService activityService=new ActivityService();
		Activity activity=new Activity();
		activity.setActivity_id(activity_id);
		activity.setStudents_id(students_id);
		activity.setClub_id(club_id);
		setTip("已");
		request.setAttribute("errorMessage","您已报名");
		if(activityService.Query(activity)==true){
            return NONE;
          }else{
            activityService.add2(activity);
  			return "actjoin";
         }
	}
	
	//社联添加活动后台
	 public String addactivity() throws Exception{
		Activity activity=new Activity();
		activity.setClub_id(1);
		activity.setActname(actname);
		activity.setActtime(acttime);
		activity.setActdesc(actdesc);
		activity.setActlocation(actlocation);
		ActivityService a=new ActivityService();
		a.add(activity);
		return "addactivity";
	 }
	//社团添加活动后台
		 public String addactivity1() throws Exception{
			Activity activity1=new Activity();
			activity1.setClub_id(club_id);
			activity1.setActname(actname);
			activity1.setActtime(acttime);
			activity1.setActdesc(actdesc);
			activity1.setActlocation(actlocation);
			ActivityService a=new ActivityService();
			a.add3(activity1);
			return "addactivity";
		 }
	 //社团登录
	 public String login() throws Exception{
			
		 Activity activity=new Activity();
		 activity.setClubpassword(clubpassword);
		 activity.setClub_id(club_id);
		 ActivityService a=new ActivityService();;
	        if(a.Query2(activity)==true){
	        	   ActionContext.getContext().getSession().put("club",activity);
	               return "backlogin";
	                 
	        }else{
	                     
	               return "error";
	        }
	}

	 
	
	
	
	
	
}
