package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloControllerTwo {
	@RequestMapping("/hellotwo")
	public String redirectHelloTwo()
	{
		return "viewpageTwo";
		
	}

}
