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
		log.info("user_idCh( call........"+user_id);
		String[] parts = user_id.split("=");
		String user_id_name = parts[0];
		log.info(user_id_name);
		String user_id_value = parts[1];
		//String ch = "존재하는 아이디입니다";
		//System.out.print(service.User_Chk(userId));
		String user_id_ok = String.valueOf(service.User_Chk(user_id_name , user_id_value));
		return user_id_ok;
	}
	
	
	@ResponseBody
	@PostMapping(value = "user_nameChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_nameCh(@RequestBody String user_name) {
		String[] parts = user_name.split("=");
		
		String user_name1 = parts[0];
		String user_value = parts[1];
		//log.info("user_idCh( call........" +userId );
		//String ch = "존재하는 아이디입니다";
		//System.out.print(service.User_Chk(userId));
		String user_name_ok = String.valueOf(service.User_Chk(user_name1 , user_value));
		return user_name_ok;
	}
	
}
