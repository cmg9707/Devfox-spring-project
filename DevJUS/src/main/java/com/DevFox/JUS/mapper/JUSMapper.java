package com.DevFox.JUS.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JUSMapper {
	//user 全体照会
	public int User_Count();
	
	//user 突き合せ
	public int User_Chk(String user_id);
}
