package com.DevFox.JUS.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.DevFox.JUS.domain.UserDTO;



@Mapper
public interface JUSMapper {

	//user 全体照会
	public int User_Count();
	
	//user 突き合せ
	public int User_Chk(@Param("username") String username ,@Param("user_value") String user_value);
	
	//user 회원가입
	public void User_join(UserDTO dto);
}
