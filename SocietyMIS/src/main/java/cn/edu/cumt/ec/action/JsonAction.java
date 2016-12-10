package cn.edu.cumt.ec.action;


import java.io.PrintWriter;
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
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.ActivityDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Activity;
import cn.edu.cumt.ec.service.ActivityService;

public class JsonAction extends ActionSupport{
	private int activity_id;
	private int club_id;
	private String actname;
	private String acttime;
	private String actlocation;
	private String actdesc;
	private String actstatus;
	private String clubemail;
	private String advice;
	
	
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


	public String getActstatus() {
		return actstatus;
	}


	public void setActstatus(String actstatus) {
		this.actstatus = actstatus;
	}


	public String getClubemail() {
		return clubemail;
	}


	public void setClubemail(String clubemail) {
		this.clubemail = clubemail;
	}


		public String getAdvice() {
		return advice;
	}


	public void setAdvice(String advice) {
		this.advice = advice;
	}


		//展示所有待审核活动	
		public String getAllActivity() throws Exception{
			HttpServletResponse response=ServletActionContext.getResponse();  
	        response.setContentType("text/html");  
	        response.setContentType("text/plain; charset=utf-8");
	        PrintWriter out = response.getWriter();
			ActivityService activityService=new ActivityService();
			List<Activity> activityList = activityService.getAllActivity();
			JSONArray jsonArray=new JSONArray();
			for(Activity com:activityList){
				JSONObject jo=new JSONObject();
				jo.put("activity_id", com.getActivity_id());
				jo.put("club_id", com.getClub_id());
				jo.put("actname", com.getActname());
				jo.put("acttime", com.getActtime());
				jo.put("actlocation", com.getActlocation());
				jo.put("actstatus", com.getActstatus());
				jo.put("actdesc", com.getActdesc());

				jsonArray.put(jo);
				
			}
			out.print(jsonArray.toString());
			out.flush();
			out.close();
			return SUCCESS;
	}
	
		
		//展示所有历史活动	
		public String getPassActivity() throws Exception{
			HttpServletResponse response=ServletActionContext.getResponse();  
	        response.setContentType("text/html");  
	        response.setContentType("text/plain; charset=utf-8");
	        PrintWriter out = response.getWriter();
			ActivityService activityService1=new ActivityService();
			List<Activity> activityList1 = activityService1.getPassActivity();
			JSONArray jsonArray1=new JSONArray();
			for(Activity com:activityList1){
				JSONObject jo=new JSONObject();
				jo.put("activity_id", com.getActivity_id());
				jo.put("club_id", com.getClub_id());
				jo.put("actname", com.getActname());
				jo.put("acttime", com.getActtime());
				jo.put("actlocation", com.getActlocation());
				jo.put("actstatus", com.getActstatus());
				jo.put("actdesc", com.getActdesc());

				jsonArray1.put(jo);
				
			}
			out.print(jsonArray1.toString());
			out.flush();
			out.close();
			return SUCCESS;
	}
		public String checkActivity() throws Exception{

			  ActivityService activityService=new ActivityService();
			  ActivityDaoJDBCImpl b=new ActivityDaoJDBCImpl();
			  activityService.setActivityDao(b);
			  Activity oldactivity=new Activity();
			  Activity newactivity=new Activity();
			     oldactivity.setActivity_id(activity_id);
			     oldactivity.setActname(actname);
				 newactivity.setActstatus(actstatus);
			  activityService.update(oldactivity,newactivity);
			  
			  //发送通知邮件
			  ActivityService activityService2=new ActivityService();
			  ActivityDaoJDBCImpl b2=new ActivityDaoJDBCImpl();
			  activityService.setActivityDao(b2);
			  Activity activity=new Activity();
			  activity=activityService2.getById(club_id);			  
				  try{
						Properties props = new Properties();
						props.setProperty("mail.smtp.auth", "true");
						props.setProperty("mail.transport.protocol", "smtp");
						props.setProperty("mail.host", "smtp.163.com");
						Session session = Session.getInstance(props, new Authenticator() {
							protected PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication("18361267929", "326womendeai");
							}
						});

						session.setDebug(true);
						Message msg = new MimeMessage(session);
						msg.setFrom(new InternetAddress("18361267929@163.com"));
						msg.setSubject("活动审核结果通知");
						msg.setRecipients(RecipientType.TO,
								InternetAddress.parse(activity.getClubemail()));
						msg.setContent("<span>"+"亲爱的"+activity.getClub_name()+"社团管理员："+"<br />"+"&emsp;&emsp;您好！<br />"
								+ "&emsp;&emsp;您欲申请的名称为【"+actname+"】的活动方案已由社团联合会审核。<br />"
										+ "当前审核结果为："+actstatus+"<br />审批意见为："+advice+"</span>","text/html;charset=gbk");
						Transport.send(msg);		
						
					}catch (Exception e) {    
			            e.printStackTrace();    
			        }
			  
			  
			  
			  
			  
			  
			  
			return NONE;
		}
		
		
		
		
	
}
