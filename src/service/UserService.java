package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LoginLogDao;
import dao.UserDao;
import domain.LoginLog;
import domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private LoginLogDao loginLogDao;
	
	public boolean hasMatchUser(String userName,String password) {
		int matchCount = userDao.getMatchCount(userName, password);
		return matchCount > 0;
	}
	public User findUserByUserName(String userName){
		return userDao.findUserByUserName(userName);
	}
	public void loginSuccess(User user){
		user.setLoginTimes(1+user.getLoginTimes());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUesrId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());;
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
	}
}
