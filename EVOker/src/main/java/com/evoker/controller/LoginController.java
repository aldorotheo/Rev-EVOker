package com.evoker.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evoker.domain.Judge;
import com.evoker.domain.Login;
import com.evoker.domain.Organizer;
import com.evoker.domain.Player;
import com.evoker.domain.UserPass;
import com.evoker.service.AuthService;

@Controller
@CrossOrigin(origins="*")
public class LoginController {
	
	@Autowired
	private AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public Login loginIn(@RequestBody UserPass userpass) {
		System.out.println("In request mapping");
		Login testLogin = authService.authorizeLogin(userpass.getUsername(), userpass.getPassword());
		System.out.println(testLogin);
		return testLogin;
	}
	@PostMapping(path="/login", consumes="application/json", produces="application/json") 
	@ResponseBody
	public Login login(@RequestBody UserPass userpass) {
		Login testLogin = authService.authorizeLogin(userpass.getUsername(), userpass.getPassword());
		return testLogin;
	}
	
	@PostMapping(path="/login/player", consumes="application/json", produces="application/json") 
	@ResponseBody
	public Player loginPlayer(@RequestBody Login login, HttpSession sess) {
		Player player = authService.authorizePlayer(login);
		sess.setAttribute("user", player);
		return player;
	}
	@PostMapping(path="/login/judge", consumes="application/json", produces="application/json") 
	@ResponseBody
	public Judge loginJudge(@RequestBody Login login, HttpSession sess) {
		Judge judge = authService.authorizeJudge(login);
		sess.setAttribute("user", judge);
		return judge;
	}
	@PostMapping(path="/login/organizer", consumes="application/json", produces="application/json") 
	@ResponseBody
	public Organizer loginOrganizer(@RequestBody Login login, HttpSession sess) {
		Organizer organizer = authService.authorizeOrganizer(login);
		sess.setAttribute("user", organizer);
		return organizer;
	}
	
}
