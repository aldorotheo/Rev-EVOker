package com.evoker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evoker.domain.JudgeTourn;
import com.evoker.domain.OrgTourn;
import com.evoker.domain.Organizer;
import com.evoker.domain.PlayerTourn;
import com.evoker.domain.Tournament;
import com.evoker.service.TournamentService;

@Controller
@CrossOrigin(origins="*")
@RequestMapping(path="/tournament")
public class TournamentController {
	@Autowired
	TournamentService tournServ;
	
	@PostMapping(path="/add", consumes="application/json", produces="application/json")
	@ResponseBody
	public Organizer addTournament(@RequestBody OrgTourn orgTourn)
	{
		Organizer org = tournServ.addTournament(orgTourn.getOrganizer(), orgTourn.getTournament());
		return org;
	}
	@GetMapping(path="/")
	@ResponseBody
	public List<Tournament> getAllTournaments(){
		return tournServ.getAllTournaments();
	}
	
	@PostMapping(path="/join", consumes="application/json", produces="application/json")
	@ResponseBody
	public List<Tournament> addPlayerToTournament(@RequestBody PlayerTourn playerTourn) {
		return tournServ.addPlayerToTournament(playerTourn.getPlayer(), playerTourn.getTournament());		
	}
	
	@PostMapping(path="/judge", consumes="application/json", produces="application/json")
	@ResponseBody
	public List<Tournament> addJudgeToTournament(@RequestBody JudgeTourn judgeTourn) {
		System.out.println(judgeTourn);
		return tournServ.addJudgeToTournament(judgeTourn.getJudge(), judgeTourn.getTournament());
	}
}
