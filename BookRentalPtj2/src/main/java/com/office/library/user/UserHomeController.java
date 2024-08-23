package com.office.library.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHomeController {

//private class UserHomeController {
//	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	@GetMapping({"", "/"})
	public String home() {
		System.out.println("[UserHomeController] home()");
		
		String nextPage = "user/home";
		
		return nextPage;
		//return this.nextPage;
	}
	
}
