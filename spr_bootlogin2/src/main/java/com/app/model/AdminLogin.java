package com.app.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminlogin11")
public class AdminLogin {
	@Id
    private long userid;
    private String uname;
    private String upass;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public AdminLogin(long userid, String uname, String upass) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.upass = upass;
	}
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
