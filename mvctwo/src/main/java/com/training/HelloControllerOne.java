package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloControllerOne {
	
	@RequestMapping("/helloone")
	public String redirectHelloOne()
	{
		return "viewpageOne";
		
	}


}
