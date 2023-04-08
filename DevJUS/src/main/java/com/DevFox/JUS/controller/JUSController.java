package com.DevFox.JUS.controller;



import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DevFox.JUS.domain.UserDTO;
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
	
	@Autowired
	private JavaMailSender mailSender;
	
	@GetMapping("join")
	public void join_from() {
		log.info("join_from() call........");
	}
	
	
	@ResponseBody
	@PostMapping(value = "user_idChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_idCh(@RequestBody String user_id) {
		log.info("user_idCh( call........"+user_id);
		String[] parts = user_id.split("=");
		String username = parts[0];
		//log.info(username);
		String user_value = parts[1];
		//String ch = "존재하는 아이디입니다";
		//System.out.print(service.User_Chk(userId));
		String user_id_ok = String.valueOf(service.User_Chk(username , user_value));
		return user_id_ok;
	}
	
	
	@ResponseBody
	@PostMapping(value = "user_nameChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_nameCh(@RequestBody String user_name) throws UnsupportedEncodingException {
		String[] parts = user_name.split("=");
		
		String username = parts[0];
		
		String user_value_decoded = parts[1];
		String user_value = URLDecoder.decode(user_value_decoded, "UTF-8");
		log.info("user_idCh( call........" +user_value);
		//String ch = "존재하는 아이디입니다";
		//System.out.print(service.User_Chk(userId));
		String user_name_ok = String.valueOf(service.User_Chk(username , user_value));
		return user_name_ok;
	}
	
	@ResponseBody
	@GetMapping(value="user_mailck")
	public String user_mailCh(@RequestParam("user_mail") String email) {
		log.info("user_mailCh( call........"+email);
		//인증번호 생성
		Random random = new Random();
		int checkNum = random.nextInt(888888)+111111;
		log.info("인증번호" + checkNum);
		
		//이메일 보내기
		String setFrom = "cmg9707@naver.com"; //보내주는메일
		String toMail = email;// 받는메일
		String title = "회원가입 인증 메일 입니다."; //제목
		String content = 
				"인증 번호는 " + checkNum + "입니다"+"<br>"+
		"인증번호를 입력해서 인증해 주세요."; // 내용
		//이메일 전송 코드
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message,true,"utf-8");
			helper.setFrom(setFrom);
			helper.setTo(toMail);
			helper.setSubject(title);
			helper.setText(content,true);
			mailSender.send(message);
		}catch(Exception e) {
			e.printStackTrace();
		}
		String num = Integer.toString(checkNum);
		
		return num;
	}
	
	@PostMapping("index")
	public void PostIndex(UserDTO dto) {
		
		log.info("Postindex.jsp call........");
		String user_id = dto.getUser_id();
		String user_name = dto.getUser_name();
		String user_pass = dto.getUser_pass();
		String user_mail = dto.getUser_mail();
		String user_birth = dto.getUser_birth();
		System.out.print(user_id+","+user_name+","+user_pass+","+user_mail+","+user_birth );
		service.User_join(dto);
		
	}
}
