package org.hangover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HangOverController {
	
	@GetMapping(path="/hello")
	@ResponseBody
	public String sayHello(){
		return "Welcome";
	}

}
