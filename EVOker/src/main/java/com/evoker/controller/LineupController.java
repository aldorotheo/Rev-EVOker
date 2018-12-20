package com.evoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evoker.domain.AddCharacter;
import com.evoker.domain.LineupEdit;
import com.evoker.domain.Login;
import com.evoker.domain.Player;
import com.evoker.domain.UserPass;
import com.evoker.service.PlayerService;

@Controller
@CrossOrigin(origins="*")
@RequestMapping(value="/lineup", method=RequestMethod.POST)
public class LineupController {
	@Autowired
	PlayerService playServ;

	@PostMapping(path="/add", consumes="application/json", produces="application/json") 
	@ResponseBody
	public Player addToLineup(@RequestBody AddCharacter adder) {
		Player testPlayer = playServ.addCharacterToLineup(adder.getCharname(), adder.getPlayer());
		return testPlayer;
	}
	
	@PostMapping(path="/edit", consumes="application/json", produces="application/json")
	@ResponseBody
	public Player editLineup(@RequestBody LineupEdit ledit) {
		Player player = null;
		System.out.println(ledit.getOldCharacterName() + " " + ledit.getNewCharacterName() + ledit.getPlayer());
		player = playServ.editCharacterInLineup(ledit);
		return player;
	}
}

