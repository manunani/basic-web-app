package com.vishnu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Vishnu on 7/21/2016
 */
@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String test(){
		return "view";
	}

}
