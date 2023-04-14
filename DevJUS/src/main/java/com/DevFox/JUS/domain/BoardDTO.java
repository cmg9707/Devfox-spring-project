package com.DevFox.JUS.domain;

import lombok.Data;

@Data
public class BoardDTO {
	private int board_idx; //文順序
	private String user_name; //作成者
	private String board_title; //タイトル
	private String board_content;//内容
	private String board_poto;//写真
	private String board_poto_new;//写真
	private String board_address;//注疏
	private String board_period_start;//開始日
	private String board_period_end;//締め日
	private String board_end;//募集の締め日
	private int board_limit;//定員
	private String board_date;//作成時間
	private int board_recommend;//推薦
	private String board_days;//一週間の何日
	private int request_order;//申込者
}
