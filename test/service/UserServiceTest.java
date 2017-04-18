package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


import domain.User;

@ContextConfiguration(locations={"/applicationContext.xml"})
public class UserServiceTest {
		
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		ApplicationContext atx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) atx.getBean("userService");
		User user = userService.findUserByUserName("gx");
		userService.loginSuccess(user);
		System.out.println(user);
		
	}

}
