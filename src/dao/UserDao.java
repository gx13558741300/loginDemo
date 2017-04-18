package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import domain.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String userName,String password){
		String sqlStr = "select count(*) from t_user where user_name=? and password=?";
		return jdbcTemplate.queryForObject(sqlStr, new Object[]{userName,password},Integer.class);
	}
	public User findUserByUserName(final String userName) {
		String sqlStr = "select user_id,user_name,login_times from t_user where user_name=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[]{userName},
				new RowCallbackHandler() {
					
					@Override
					public void processRow(ResultSet rs) throws SQLException {
						user.setUesrId(rs.getInt("user_id"));
						user.setUserName(userName);;
						user.setLoginTimes(rs.getInt("login_times"));
						user.setLastIp("192.168.0.1");
						user.setLastVisit(new Date());
					}
				});
		return user;
	}
	public void updateLoginInfo(User user){
		String sqlStr = "update t_user set last_visit=?,last_ip=?,login_times=? where user_id=?";
		jdbcTemplate.update(sqlStr, new Object[]{user.getLastVisit(),user.getLastIp(),user.getLoginTimes(),user.getUesrId()});
	}
}
