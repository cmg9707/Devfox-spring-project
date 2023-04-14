package com.DevFox.JUS.controller;



import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.DevFox.JUS.domain.BoardDTO;
import com.DevFox.JUS.domain.CommentDTO;
import com.DevFox.JUS.domain.RecommendDTO;
import com.DevFox.JUS.domain.RequestDTO;
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
	
	public void mainIndex(HttpServletRequest request) {
		log.info("index.jsp call........");
		request.getSession().invalidate();
		request.getSession(true);
	}
	
	@Autowired
	private JUSService service; //service 依存性
	
	@Autowired
	private JavaMailSender mailSender;
	
	//会員加入
	@GetMapping("join")
	public void join_from() {
		log.info("join_from() call........");
	}
	
	//同じIDチェック
	@ResponseBody
	@PostMapping(value = "user_idChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_idCh(@RequestBody String user_id) {
		log.info("user_idCh( call........"+user_id);
		String[] parts = user_id.split("=");
		String username = parts[0]; // user_id
		
		String user_value = parts[1];//user_idの値
		String user_id_ok = String.valueOf(service.User_Chk(username , user_value));
		return user_id_ok;
	}
	
	//同じニックネームチェック
	@ResponseBody
	@PostMapping(value = "user_nameChk" ,  produces = "application/text; charset=UTF-8" )
	public String user_nameCh(@RequestBody String user_name) throws UnsupportedEncodingException {
		String[] parts = user_name.split("=");
		
		String username = parts[0]; //user_name
		
		String user_value_decoded = parts[1]; //user_nameの値
		String user_value = URLDecoder.decode(user_value_decoded, "UTF-8");
		log.info("user_idCh( call........" +user_value);

		String user_name_ok = String.valueOf(service.User_Chk(username , user_value));
		return user_name_ok;
	}
	
	//メール認証
	@ResponseBody
	@GetMapping(value="user_mailck")
	public String user_mailCh(@RequestParam("user_mail") String email) {
		log.info("user_mailCh( call........"+email);
		//認証番号の作成
		Random random = new Random();
		int checkNum = random.nextInt(888888)+111111;
		log.info("인증번호" + checkNum);
		
		//이메일 보내기
		String setFrom = "cmg9707@naver.com"; //送ってくれるメール
		String toMail = email;// 受信メール
		String title = "회원가입 인증 메일 입니다."; //タイトル.
		String content = 
				"인증 번호는 " + checkNum + "입니다"+"<br>"+
		"인증번호를 입력해서 인증해 주세요."; // 内容
		//メール転送コード
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
	//会員登録完了
	@PostMapping("index")
	public void PostIndex(UserDTO dto) {
		
		log.info("Postindex.jsp call........");
		service.User_join(dto);
		
	}
	//login
	@GetMapping("login")
	public void Getlogin() {
		
		log.info("Getlogin.jsp call........");

	}
	//loginチェック
	@ResponseBody
	@GetMapping("login_Chk")
	public String Login_chk(@RequestParam("user_id") String user_id ,@RequestParam("user_pass") String user_pass
			,HttpServletRequest request, HttpServletResponse response,Model model) {
		log.info("Login_chk.jsp call........" + user_id);
	    log.info("Login_chk.jsp call........" + user_pass);

	    int id_c = service.User_login_id(user_id);

	    if (id_c == 0) { // IDが存在しない場合
	        return "0";
	    } else { // IDが存在する時
	        int pass_c = service.User_login_idpass(user_id, user_pass);

	        if (pass_c == 0) { // フェスワード番号が間違った時
	            return "1";
	        } else { // ログイン成功
	        	UserDTO dto = service.user_select(user_id);
	        	HttpSession session = request.getSession();// セッション生成
	        	session.setAttribute("user", dto);
	        	session.setMaxInactiveInterval(1800);//セッション維持時間1800秒
	        	model.addAttribute("user" ,session );
	            return "2";
	        }
	        
	    }

	}
	
	//boardPage 移動
	@GetMapping("board")
	public void Getboard() {
		log.info("Getboard call........");

	}
	//board list
	@ResponseBody
	@GetMapping("boardList")
	public Map<String, Object> ajaxboard(@RequestParam("nowPage") int nowPage) {
		log.info("ajaxboard call........");
		int startPage = (nowPage - 1) * 8; //始まる番号
		Map<String, Object> response = new HashMap<>();
		List<BoardDTO> startList =  service.boardList(startPage);
		int size = service.Board_Count();
		
	    response.put("size", size);
	    response.put("startList", startList);
	    
	    return response;
	}
	//boardページング
	@PostMapping("boardPage")
	@ResponseBody
	public Map<String, Object> boardPageList(@RequestBody List<Map<String, String>> checkArr) {
		log.info("boardPageList"+checkArr);
		List<String> nameArr = new ArrayList<>();
	    List<String> dataArr = new ArrayList<>();
	    int startPage = 1;
	    int size = 0;
	    String name="";

	    Map<String, Object> response = new HashMap<>();
	    for (Map<String, String> map : checkArr) { 
	    	if(!map.get("name").equals("nowPage")) { // 配列の名前がnowPageでないとき
	    		if(map.get("name").equals("user_name")) {
	    			name = map.get("value");
	    		}
	    		nameArr.add(map.get("name"));
		    	dataArr.add(map.get("value"));
	    	}else {
	    		startPage = (Integer.parseInt(map.get("value"))-1)*8;	
	    	}
	    	
	    }
	    log.info("boardPageList"+checkArr);
	    if(nameArr.isEmpty()) {//nowPageだけがある場合
	    	List<BoardDTO> startList =  service.boardList(startPage);
			size = service.Board_Count();
			log.info("size="+size);
			response.put("size", size);
		    response.put("startList", startList);
	    }else {
	    	size = service.BoardUser_Count(name);
	    	List<BoardDTO> startList = service.BoardUser_list(nameArr, dataArr, startPage);
	    	log.info("+"+startList);
			response.put("size", size);
		    response.put("startList", startList);
	    }
	    
		return  response;
	}
	
	//推薦
	@GetMapping("UPpage")
	@ResponseBody
	public Map<String, Object> UPpageList(@RequestParam int startPage){
		log.info("UPpageList. colll");
		Map<String, Object> response = new HashMap<>();
		List<BoardDTO> startList = service.UPpageListCommend(startPage);
		int size =  service.Board_Count();
		 
		log.info("size"+size);
	    response.put("size", size);
	    response.put("startList", startList);
	    
	    return response;
	}
	
	
	
	
	
	
	
	@GetMapping("writing")
	public void Getwriting() {
		
		log.info("Getwriting call........");

	}
	//ぶん登録
	@PostMapping("writing")
	public String Postwriting(@RequestParam("board_title") String board_title,
			@RequestParam("board_content") String board_content,
			@RequestParam("user_name") String user_name,
			@RequestParam("board_limit") String board_limit,
			@RequestParam("board_address") String board_address,
			@RequestParam("board_days") String board_days,
			@RequestParam("board_end") String board_end,
			@RequestParam("board_period_start") String board_period_start,
			@RequestParam("board_period_end") String board_period_end
			,@RequestParam("board_poto") MultipartFile file) throws Exception{
		
		log.info("Getwriting call........"+ file.getOriginalFilename()); 
		String board_poto = file.getOriginalFilename();//ファイル元の名前
		String[] newpotoname = board_poto.split("\\.");//split()は正規文字列で表すが、.はすべての文字列という意味で.に分けるためには\を追加させて文字通り認識させなければならない。
		Random random = new Random();
		int board_poto_Count = random.nextInt(888888)+111111;
		String board_poto_new = newpotoname[0]+board_poto_Count+"."+newpotoname[1];
		FileOutputStream fos = new FileOutputStream("C:/JUS/work/DevfoxProject/.metadata/.plugins/org.eclipse.wst.server.core/uploadimg/"+board_poto_new);
		 // ファイル保存する位置+ファイル名をパラメータとして入れ、fileOutputStreamオブジェクトを生成し
		InputStream is = file.getInputStream();
		 // ファイルからinputStreamを持ってくる。
		int readCount = 0;
        byte[] buffer = new byte[1024];
        //ファイルを読むサイズだけのbufferを生成し
        while ((readCount = is.read(buffer)) != -1) {
          //  ファイルからインポートされた file Input Stream を設定したサイズ (1024 byte) の分だけ読んで
            
         fos.write(buffer, 0, readCount);
          // 上で生成したfileOutputStreamオブジェクトに出力することを繰り返す
        };
        
        BoardDTO dto = new BoardDTO();
		dto.setBoard_title(board_title);
		dto.setBoard_content(board_content);
		dto.setUser_name(user_name);
		dto.setBoard_limit(Integer.parseInt(board_limit));
		dto.setBoard_address(board_address);
		dto.setBoard_days(board_days);
		dto.setBoard_end(board_end);
		dto.setBoard_period_start(board_period_start);
		dto.setBoard_period_end(board_period_end);
		dto.setBoard_poto(board_poto);// 原本の名前
		dto.setBoard_poto_new(board_poto_new);//新しい名前;
		
		service.board_writing(dto);
		
		return "redirect:board?nPage="+1;
	}
	
	@GetMapping("view")
	public void Getview(@RequestParam("board_idx") String board_idx, @RequestParam("user_name") String user_name,Model model) {
		model.addAttribute("reqOK",service.ViewRequestOK(board_idx, user_name));//申込み確認
		model.addAttribute("board", service.viewDTO(board_idx));
		model.addAttribute("recooOK", service.recommendOK(board_idx, user_name));//推薦確認
		log.info("Getview call........");

	}
	//推薦
	@Transactional
	@ResponseBody
	@PostMapping("view_request")
	public int View_Request(@RequestParam("user_name") String user_name,
							 @RequestParam("board_idx") String board_idx,
							 @RequestParam("request_user") String request_user) {
		
		int request_order = service.request_orderMax(board_idx)+1; // 文の申込者数
		service.board_request_update(request_order, board_idx);
		RequestDTO dto = new RequestDTO();
		dto.setBoard_idx(Integer.parseInt(board_idx)); //文ナンバー
		dto.setUser_name(user_name); // 文の主人
		dto.setRequest_user(request_user); // 文の申込者数
		dto.setRequest_order(request_order);//申請した数
		service.Requestinsert(dto);
		return request_order;
	}
	
	//申請取り消し
	@Transactional
	@ResponseBody
	@PostMapping("view_request_m")
	public int View_Request_m(
							 @RequestParam("board_idx") String board_idx,
							 @RequestParam("request_user") String request_user) {
		
		
		service.RequestDe(board_idx, request_user);// 申請取り消し
		int request_order = service.request_orderMax(board_idx)-1; //文の申込者数
		
		service.board_request_update(request_order, board_idx);
		
		return request_order;
	}
	
	//추천
	@Transactional
	@ResponseBody
	@PostMapping("view_recommend")
	public int View_recommend(@RequestParam("user_name") String user_name,
							 @RequestParam("board_idx") String board_idx,
							 @RequestParam("recommend_user") String recommend_user) {
		log.info("view_recommend call........");
		
		int recommendOK = service.recommendOK(board_idx, recommend_user); // 推薦を押したか確認
		if(recommendOK == 0) {
			int recommend_order = service.recommendMax(board_idx)+1; // 推薦 +1
			service.board_recommend_update(recommend_order, board_idx);
			RecommendDTO dto = new RecommendDTO();
			dto.setBoard_idx(Integer.parseInt(board_idx)); //文ナンバー
			dto.setUser_name(user_name); // 文の主人
			dto.setRecommend_user(recommend_user); // 文の申込者数
			service.Recommendinsert(dto);
			return recommend_order;
		}else {
			return 0;
		}
		
		
	}
	//コメント保存
	@ResponseBody
	@PostMapping("reTestComment")
	public List<CommentDTO> reTestComment(CommentDTO dto) {
		
		dto.setComment_idx(service.Comment_idxMax()+1);
		dto.setComment_grp(service.Comment_idxMax()+1);
		dto.setComment_grps(1);
		dto.setComment_nb(service.Comment_idxMax()+1);
		service.reComment_insert(dto);
		List<CommentDTO> list = service.CommentList();
		return list;
	}
	
	//REコメント保存
	@ResponseBody
	@PostMapping("rereTestComment")
	public Map<String, Object> rereTestComment(CommentDTO dto ,@RequestParam("nowPage") int nowPage) {
		
		dto.setComment_grp(dto.getComment_idx());// コメント·グループ 
		int nb = dto.getComment_nb();//コメント固有番号
		int comment_grps =  service.COgrps(nb)+1; //コメント順
		dto.setComment_grps(comment_grps);
		dto.setComment_nb(service.Comment_idxMax()+1);
		if(comment_grps>2) {
			service.UPComment(dto);// コメントに入る前に順番を変えておく
		}else {
			dto.setComment_grps(service.GrpsMax(dto.getComment_grp())+1);//グループ内の順序+1
		}
		
		service.rereComment_insert(dto);//REコメント保存
		int startPage = (nowPage - 1) * 10;
		Map<String, Object> response = new HashMap<>();
		List<CommentDTO> startList = service.CommentPage(startPage);
		List<CommentDTO> list = service.CommentList();
		int size = list.size();
		
	    response.put("size", size);
	    response.put("startList", startList);
		
		return response;
	}
	//コメントリスト
	@GetMapping("CommentList")
	@ResponseBody
	public List<CommentDTO> CommentList() {
		List<CommentDTO> list = service.CommentList();
		return list;
	}
	
	//コメント削除
	@ResponseBody
	@PostMapping("CommentDel")
	public Map<String, Object> CommentDel(@RequestParam("comment_nb") String comment_nb, @RequestParam("nowPage") int nowPage) {	
		
		service.CommentDele(comment_nb);
		
		int startPage = (nowPage - 1) * 10;
		Map<String, Object> response = new HashMap<>();
		List<CommentDTO> startList = service.CommentPage(startPage);
		List<CommentDTO> list = service.CommentList();
		int size = list.size();
		
	    response.put("size", size);
	    response.put("startList", startList);
		
		return response;
	}
	
	//コメント修正
	@ResponseBody
	@PostMapping("CommentMod")
	public Map<String, Object> CommentMod(CommentDTO dto , @RequestParam("nowPage") int nowPage) {	
		log.info("comment_grps"+dto.getComment_content());
		log.info("comment_grps"+dto.getComment_nb());
		service.CommentMode(dto);
		
		int startPage = (nowPage - 1) * 10;
		Map<String, Object> response = new HashMap<>();
		List<CommentDTO> startList = service.CommentPage(startPage);
		List<CommentDTO> list = service.CommentList();
		int size = list.size();
		
	    response.put("size", size);
	    response.put("startList", startList);
	    
	    return response;
	}
	
	//コメントページング
	@GetMapping("commentPage")
	@ResponseBody
	public Map<String, Object> CommentPage(@RequestParam("startPage") int startPage ) {
		
		Map<String, Object> response = new HashMap<>();
		List<CommentDTO> list = service.CommentPage(startPage);
		List<CommentDTO> Pagelist = service.CommentList();
		int size = Pagelist.size();
		
	    response.put("size", size);
	    response.put("list", list);
		return response;
	}
	
	//コメント入力最後のリスト
	@GetMapping("Commint_insert_list")
	@ResponseBody
	public List<CommentDTO> Commint_insert_list(Model model) {
		List<CommentDTO> list = service.CommentList();
		int size = list.size();
		log.info("size " + size );
		int startPage = (int) Math.ceil(size / 10.);
		log.info("intstartPage " + startPage );
		startPage = (startPage - 1) * 10;
		log.info("startPage " + startPage );
		list = service.CommentPage(startPage);
		model.addAttribute("size", size);
		return list;
	}
	
	@GetMapping("modify")
	public void Getmodify(Model model , @RequestParam("board_idx")int board_idx){
		log.info("Getmodify"+board_idx);
		BoardDTO board = service.BoardmodifyList(board_idx);
		
		model.addAttribute("board", board);
	}
	
	//文の修正 (文の登録と同じ)
	@PostMapping("modify")
	public String Postmodify(@RequestParam("board_idx") int board_idx,
			@RequestParam("board_title") String board_title,
			@RequestParam("board_content") String board_content,
			@RequestParam("user_name") String user_name,
			@RequestParam("board_limit") String board_limit,
			@RequestParam("board_address") String board_address,
			@RequestParam("board_days") String board_days,
			@RequestParam("board_end") String board_end,
			@RequestParam("board_period_start") String board_period_start,
			@RequestParam("board_period_end") String board_period_end,
			@RequestParam("board_o_poto") String board_o_poto//保存されている写真の名前
			,@RequestParam("board_poto") MultipartFile file) throws Exception{
		
		log.info("Getwriting call........"+ file.getOriginalFilename());
		String old_poto = board_o_poto; //保存されている写真の名前
		String board_poto = file.getOriginalFilename();
		String[] newpotoname = board_poto.split("\\.");
		Random random = new Random();
		int board_poto_Count = random.nextInt(888888)+111111;
		String board_poto_new = newpotoname[0]+board_poto_Count+"."+newpotoname[1];
		String oldPath = "C:/JUS/work/DevfoxProject/.metadata/.plugins/org.eclipse.wst.server.core/uploadimg/" + old_poto;
		File oldFile = new File(oldPath);
		if (oldFile.exists()) {//オリジナルファイル削除
		    oldFile.delete();
		}
		
		FileOutputStream fos = new FileOutputStream("C:/JUS/work/DevfoxProject/.metadata/.plugins/org.eclipse.wst.server.core/uploadimg/"+board_poto_new);
		InputStream is = file.getInputStream();
		int readCount = 0;
        byte[] buffer = new byte[1024];
        while ((readCount = is.read(buffer)) != -1) {
            
         fos.write(buffer, 0, readCount);
        };
        BoardDTO dto = new BoardDTO();
        dto.setBoard_idx(board_idx);
		dto.setBoard_title(board_title);
		dto.setBoard_content(board_content);
		dto.setUser_name(user_name);
		dto.setBoard_limit(Integer.parseInt(board_limit));
		dto.setBoard_address(board_address);
		dto.setBoard_days(board_days);
		dto.setBoard_end(board_end);
		dto.setBoard_period_start(board_period_start);
		dto.setBoard_period_end(board_period_end);
		dto.setBoard_poto(board_poto);// 원본이름
		dto.setBoard_poto_new(board_poto_new);// 새이름
		//수정
		service.Boardmodif(dto);
		
		return "redirect:view?board_idx="+board_idx+"&user_name="+user_name;
	}
	
	//文の削除
	@GetMapping("delete")
	public String Postdelete(@RequestParam("board_idx") int board_idx) {
		
		service.BoardDelete(board_idx);
		return "redirect:board";
	}
	
	//ユーザー情報
	@GetMapping("info")
	public void user_info() {
		
	}
	
	//passボタンを押したとき
	@ResponseBody
	@GetMapping("infopass")
	public UserDTO infoPassList(@RequestParam("user_id") String user_id ){
		UserDTO dto = service.user_select(user_id);
		
		return dto;
	}
	//パスワード変更時
	@PostMapping("infopasswdch")
	public String infopasswdch(UserDTO dto){
		service.User_pass_ch(dto);
		return "redirect:info";
	}
	
	//私の文確認
	@ResponseBody
	@GetMapping("infotext")
	public List<BoardDTO> infotext(@RequestParam("user_name") String user_name){
		log.info("infotext"+user_name);
		List<BoardDTO> list = service.infotextList(user_name);
		
		return list;
	}
	
	
	
}
