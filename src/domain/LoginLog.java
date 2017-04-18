package domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int loginLogId;
	private int userId;
	private String ip;
	private Date loginDate;
	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}
	public int getLoginLogId() {
		return loginLogId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "LoginLog [loginLogId=" + loginLogId + ", userId=" + userId
                + ", ip=" + ip + ", loginDate=" + loginDate + "]";
	}
	

}
