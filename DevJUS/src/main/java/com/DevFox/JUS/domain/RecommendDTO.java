package com.DevFox.JUS.domain;

import lombok.Data;

@Data
public class RecommendDTO {
	private String user_name;//コメントの主人
	private int board_idx; //文順序
	private String recommend_user;//作成者
}
