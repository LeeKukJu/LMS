package kr.or.ddit.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/loginForm.do")
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(
			@RequestParam("identity") String identity,
			UserVO user,
			HttpSession session,
			Model model
			) {
		log.info("신분 : " + identity);
		log.info("아이디 : " + user.getUserId());
		log.info("비밀번호 : " + user.getPassword());
		
		
		return "success";
	}
}
