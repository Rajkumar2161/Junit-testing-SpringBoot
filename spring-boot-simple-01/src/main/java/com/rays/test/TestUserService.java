package com.rays.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rays.dto.UserDTO;
import com.rays.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

	@Autowired
	private UserService userService;

	@Test
	public void testAdd() {

		UserDTO dto = new UserDTO();
		dto.setFirstName("kayra");
		dto.setLastName("meena");
		dto.setLoginId("abc@gmail.com");
		dto.setPassword("1234");

		long pk = userService.add(dto);

		dto = userService.get(pk);

		assertNull("data is added", dto);
	}

//	@Test
//	public void testUpdate() {
//		UserDTO dto = new UserDTO();
//		dto.setId(1L);
//		dto.setPassword("123");
//
//		userService.update(dto);
//
//		dto = userService.get(1);
//
//		assertEquals("123", dto.getPassword());
//	}
//
//	@Test
//	public void testDelete() {
//
//		userService.delete(1);
//
//		UserDTO dto = userService.get(1);
//
//		assertNotNull("data is not found", dto);
//	}
//
}
