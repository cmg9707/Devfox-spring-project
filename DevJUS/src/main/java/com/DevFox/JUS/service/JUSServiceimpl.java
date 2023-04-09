package com.DevFox.JUS.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevFox.JUS.domain.UserDTO;
import com.DevFox.JUS.mapper.JUSMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JUSServiceimpl implements JUSService {
	
	private static final Logger log=
			LoggerFactory.getLogger(JUSServiceimpl.class);
	
	@Autowired
	private JUSMapper mapper; //mapper 依存性
	
	@Override
		public int User_Count() {
			return mapper.User_Count();
		}
	
	@Override
	public int Board_Count() {
		return mapper.Board_Count();
	}
	
	@Override
	public int User_Chk(String username ,String user_value) {
		
		return mapper.User_Chk(username ,user_value);
	}
	
	@Override
	public void User_join(UserDTO dto) {
		mapper.User_join(dto);
	}
	
	@Override
	public int User_login_id(String user_id) {
		return mapper.User_login_id(user_id);
	}
	
	@Override
	public int User_login_idpass(String user_id, String user_pass) {
		return mapper.User_login_idpass(user_id, user_pass);
	}
	
	@Override
	public UserDTO user_select(String user_id) {
		return mapper.user_select(user_id);
	}
}
