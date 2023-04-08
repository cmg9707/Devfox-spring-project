package com.DevFox.JUS.service;

import com.DevFox.JUS.domain.UserDTO;

public interface JUSService {
	//user 全体照会
	public int User_Count();
	
	//user 突き合せ
	public int User_Chk(String username ,String user_value );
	
	//user 회원가입
	public void User_join(UserDTO dto);

}
