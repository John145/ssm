package cn.jxufe.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jxufe.mapper.UserMapper;
import cn.jxufe.po.User;

public class TestUser {
	@Test
	public void test1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(2);
		System.out.println(user);
	}
}
