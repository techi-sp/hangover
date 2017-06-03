package org.hangover.controller;

import java.util.List;

import org.hangover.model.User;
import org.hangover.services.HangOverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HangOverController {
	
	@Autowired
	private HangOverService hangOverService;
	
	@GetMapping(path="/hello")
	@ResponseBody
	public String sayHello(){
		return "Welcome";
	}
	
	@GetMapping(path="/users")
	@ResponseBody
	public List<User> getUserList(){
		return hangOverService.getAllUsers();
	}

}
