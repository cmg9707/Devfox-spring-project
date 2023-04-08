package com.DevFox.JUS.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface JUSMapper {

	//user 全体照会
	public int User_Count();
	
	//user 突き合せ
	public int User_Chk(@Param("user_id_name") String user_id_name ,@Param("user_id_value") String user_id_value);
}
