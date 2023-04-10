package com.DevFox.JUS.service;

import java.util.List;

import com.DevFox.JUS.domain.BoardDTO;
import com.DevFox.JUS.domain.UserDTO;

public interface JUSService {
	//user 全体照会
	public int User_Count();
	
	//board 全体照会
	public int Board_Count();
	
	//user 突き合せ
	public int User_Chk(String username ,String user_value );
	
	//user 회원가입
	public void User_join(UserDTO dto);
	
	//user id있는지
	public int User_login_id(String user_id);
	
	//user pass, id
	public int User_login_idpass(String user_id , String user_pass);
	
	//user_select
	public UserDTO user_select(String user_id);
	
	//board 글쓰기
	public void board_writing(BoardDTO dto);
	
	//board List
	public List<BoardDTO> boardList();
	
	//view
	public BoardDTO viewDTO(String board_idx);
}
