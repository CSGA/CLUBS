package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.entity.Users;
import cn.edu.cumt.ec.service.UsersService;

public class UsersAction extends ActionSupport{
	private String students_id;
	private String students_name;
    private String students_password;
	private String students_school;
	private String students_sex;
    private String students_class;
    private String students_email;
    private String students_tel;
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
//			        	   ActionContext.getContext().getSession().put("username",students_name);
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
}
