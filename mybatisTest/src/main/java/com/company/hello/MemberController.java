package com.company.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("login")
	public String memberLogin(Member member, Model model) {
		Member loginMember = memberService.loginMember(member);
		if(loginMember == null) {
			model.addAttribute("msg", "로그인 실패");
			return "common/errorPage";
		}else {
			model.addAttribute("loginMember", loginMember);
			return "index";
		}
	}
}
