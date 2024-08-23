package com.company.cookie.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public interface MemberController {

	private String nextPage;
	
	@GetMapping({"","/"})
	public String home() {
		System.out.println("[MemberController] home()");
		this.nextPage = "member/home";
		
		return this.nextPage;
	}
	@GetMapping("/loginForm")
	public String loginForm() {
		System.out.println("[MemberController] loginForm()");
		

		
		this.nextPage = "member/login_form";
		
		return this.nextPage;
	}
}

