package domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String userName;
	private String password;
	private String lastIp;
	private Date lastVisit;
	private int loginTimes;
	
	public void setUesrId(int uesrId) {
		this.userId = uesrId;
	}
	public int getUesrId() {
		return userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLoginTimes(int loginTimes) {
		this.loginTimes = loginTimes;
	}
	public int getLoginTimes() {
		return loginTimes;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "User [userId=" + userId + ", userName=" + userName
                + ", password=" + password  + ", lastIp=" + lastIp 
                + ", lastVisit=" + lastVisit + ", logintimes=" + loginTimes+"]";
	}
	

}
