package com.DevFox.JUS.domain;

import lombok.Data;

@Data
public class RequestDTO {
	private String user_name;//作成者
	private int board_idx; //文順序
	private String request_user;//申込者
	private int request_order;//申請順序 , 定員計算
}
