package com.DevFox.JUS.service;

import java.util.List;

import com.DevFox.JUS.domain.BoardDTO;
import com.DevFox.JUS.domain.CommentDTO;
import com.DevFox.JUS.domain.RecommendDTO;
import com.DevFox.JUS.domain.RequestDTO;
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
	public List<BoardDTO> boardList(int startPage);
	
	//view
	public BoardDTO viewDTO(String board_idx);
	
	//request_order Max
	public int request_orderMax(String board_idx);
	
	//board_recommend update
	public void board_request_update(int request_order , String board_idx);
	
	//Request insert
	public void Requestinsert(RequestDTO dto);
	
	//ViewRequestOK
	public int ViewRequestOK(String board_idx , String user_name);
	
	//Request Del
	public void RequestDe(String board_idx , String request_user);
	
	//recommend Max
	public int recommendMax(String board_idx);
	
	//board_recommend_update
	public void board_recommend_update(int recommend_order, String board_idx);
	
	//Recommendinsert insert
	public void Recommendinsert(RecommendDTO dto);
	
	//recommendOK
	public int recommendOK(String board_idx , String recommend_user);
	
	
	//댓글 부모 idx +1
	public int Comment_idxMax();
	
	//댓글등록
	public void reComment_insert(CommentDTO dto);
	
	//댓글 리스트
	public List<CommentDTO> CommentList();
	
	//댓글 순서 구하기
	public int COgrps(int nb);
	
	//댓글 순서 업데이트
	public void UPComment(CommentDTO dto);
	
	//대댓글 등록
	public void rereComment_insert(CommentDTO dto);
	
	//그룹의 대댓글  최대수
	public int GrpsMax(int comment_grp);
	
	//댓글 삭제
	public void CommentDele(String comment_nb);
	
	//댓글 수정
	public void CommentMode(CommentDTO dto);
	
	//댓글 페이지
	public List<CommentDTO> CommentPage(int startPage);
	
	//특정 idx 글
	public BoardDTO BoardmodifyList(int board_idx);
	
	//글 수정
	public void Boardmodif(BoardDTO dto);
	
	//글 삭제
	public void BoardDelete(int board_idx);
	
	//특정 유저글 수
	public int BoardUser_Count(String name);
	
	//특정글 list
	public List<BoardDTO> BoardUser_list(List<String> nameArr, List<String> dataArr, int startPage);
	
	//추천순 list
	public List<BoardDTO> UPpageListCommend(int startPage);
	
	//비밀번호 변경
	public void User_pass_ch(UserDTO dto);
	
	//내글 확인
	public List<BoardDTO> infotextList(String user_name);
}
