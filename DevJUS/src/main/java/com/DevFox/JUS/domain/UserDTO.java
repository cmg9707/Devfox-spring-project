package com.DevFox.JUS.domain;

import lombok.Data;

@Data
public class UserDTO {
	private String user_id; //ID
	private String user_name; //あだ名
	private String user_pass; //パスワ-ド
	private String user_birth;//生年月日
	private String user_mail;//メール
	private String user_power;//権限
}
