package com.DevFox.JUS.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.DevFox.JUS.mapper.JUSMapper;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JUSMapperTest {

	@Autowired
	private JUSMapper mapper;
	
	@Test
	public void testUserCount() {
		int count = mapper.User_Count();
		log.info("User Count.............. : " + count);
	}
}
