package service;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import domain.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class UserServiceTest {
		
	@Autowired
	private  UserService userService;
	
	@Test
	public void testUserService() {
		
	
//		ApplicationContext atx = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService userService = (UserService) atx.getBean("userService");
		User user = userService.findUserByUserName("gx");
		userService.loginSuccess(user);
		System.out.println(user);
		
	}

}
