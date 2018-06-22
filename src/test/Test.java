package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pb.entity.User;
import com.pb.service.UserService;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service =  (UserService)context.getBean("userService");
		service.addUser(new User());
	}
}
