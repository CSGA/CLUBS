package cn.edu.cumt.ec.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;

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
	
}
