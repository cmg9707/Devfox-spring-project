package com.DevFox.JUS.domain;

import lombok.Data;

@Data
public class CommentDTO {
	private int comment_idx; //コメント順序
	private String user_name;//作成者
	private int board_idx;//原本文順序
	private int comment_grp;//コメント·グループ
	private int comment_grps;//グループ内の順序
	private int comment_nb;//コメントorコメントの中のコメント
	private String comment_content;//コメントの内容
	private String comment_date;//コメントの時間
}
