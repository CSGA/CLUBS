package cn.edu.cumt.ec.action;

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

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.entity.Users;
import cn.edu.cumt.ec.service.ActivityService;
import cn.edu.cumt.ec.service.UsersService;

public class UsersAction extends ActionSupport{
	private int club_id;
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	private String students_id;
	private String students_name;
    private String students_password;
	private String students_school;
	private String students_sex;
    private String students_class;
    private String students_email;
    private String students_tel;
    private String activity_id;
    public String getStudents_id() {
		return students_id;
	}
	public void setStudents_id(String students_id) {
		this.students_id = students_id;
	}
	public String getStudents_name() {
		return students_name;
	}
	public void setStudents_name(String students_name) {
		this.students_name = students_name;
	}
	public String getStudents_password() {
		return students_password;
	}
	public void setStudents_password(String students_password) {
		this.students_password = students_password;
	}
	public String getStudents_school() {
		return students_school;
	}
	public void setStudents_school(String students_school) {
		this.students_school = students_school;
	}
	public String getStudents_sex() {
		return students_sex;
	}
	public void setStudents_sex(String students_sex) {
		this.students_sex = students_sex;
	}
	public String getStudents_class() {
		return students_class;
	}
	public void setStudents_class(String students_class) {
		this.students_class = students_class;
	}
	public String getStudents_email() {
		return students_email;
	}
	public void setStudents_email(String students_email) {
		this.students_email = students_email;
	}
	public String getStudents_tel() {
		return students_tel;
	}
	public void setStudents_tel(String students_tel) {
		this.students_tel = students_tel;
	}
	

	//用户登录
			public String login() throws Exception{
			
					Users users=new Users();
					users.setStudents_password(students_password);
					users.setStudents_id(students_id);
//					users.setStudents_name(students_name);
					UsersService usersservice=new UsersService();
			           if(usersservice.Query(users)==true){
			        	   ActionContext.getContext().getSession().put("user",users);
			                  return "login";
			                 
			             }else{
			                     
			                  return "error";
			            }
			}
  //	用户注册		
			public String register() throws Exception{
				 Users users=new Users();
				 users.setStudents_password(students_password);
				 users.setStudents_email(students_email);
				 users.setStudents_name(students_name);
				 users.setStudents_tel(students_tel);
				 users.setStudents_sex(students_sex);
				 users.setStudents_id(students_id);
				 users.setStudents_school(students_school);
				 users.setStudents_class(students_class);
				 if(getStudents_name()!=null){
					 UsersService a=new UsersService();
					 a.add(users);
					 return "register_success";
					 
			      }
				 else
				 {
					 return "errors";
				 }
			}
			//通知报名社团学生已报名成功
			 public String tellmen() throws Exception{
					UsersService a=new UsersService();
					List<Users> users= a.getemail(club_id);
					Users user = null;
					for(int i=0;i<users.size();i++)
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
							msg.setSubject("报名活动审核结果通知");
							user = new Users();
							user = users.get(i);
							msg.setRecipients(RecipientType.TO,
									InternetAddress.parse(user.getStudents_email()));
							msg.setContent("<span>"+"亲爱的同学"+"<br />"+"&emsp;&emsp;您好！<br />"
									+ "&emsp;&emsp;您已经加入该活动<br />"
											+ "当前审核结果为：同意"+"</span>","text/html;charset=gbk");
							Transport.send(msg);		
							
						}catch (Exception e) {    
				            e.printStackTrace();    
				        }
					return "tellmen";
				 }
			//通知报名社团学生已报名成功
			 public String joinstu() throws Exception{
					UsersService a=new UsersService();
					List<Users> users= a.getemail1(activity_id);
					Users user = null;
					for(int i=0;i<users.size();i++)
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
							msg.setSubject("报名社团审核结果通知");
							user = new Users();
							user = users.get(i);
							msg.setRecipients(RecipientType.TO,
									InternetAddress.parse(user.getStudents_email()));
							msg.setContent("<span>"+"亲爱的同学"+"<br />"+"&emsp;&emsp;您好！<br />"
									+ "&emsp;&emsp;您已经加入该社团<br />"
											+ "当前审核结果为：同意你加入本社团"+"</span>","text/html;charset=gbk");
							Transport.send(msg);		
							
						}catch (Exception e) {    
				            e.printStackTrace();    
				        }
					return "tellmen1";
				 }
}
