package com.DevFox.JUS.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DevFox.JUS.service.JUSService;

import lombok.AllArgsConstructor;

@AllArgsConstructor // 自動生成者
@Controller 
@RequestMapping("JUS")
public class JUSController {
	private static final Logger log=
				LoggerFactory.getLogger(JUSController.class);
	@GetMapping("index")
	public void mainIndex() {
		log.info("index.jsp call........");
	}
	
	@Autowired
	private JUSService service; //service 依存性
	
	@GetMapping("join")
	public void join_from() {
		log.info("join_from() call........");
	}
	
	
	@ResponseBody
	@PostMapping(value = "user_idChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_idCh(@RequestBody String user_id) {
		log.info("user_idCh( call........" +user_id );
		String ch = "존재하는 아이디입니다";

		int ok = service.User_Chk(user_id);

		return ch;
	}
	
	
	
}
