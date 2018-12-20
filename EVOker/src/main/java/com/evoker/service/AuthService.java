package com.evoker.service;

import org.springframework.stereotype.Service;

import com.evoker.dao.JudgeDao;
import com.evoker.dao.LoginDao;
import com.evoker.dao.OrganizerDao;
import com.evoker.dao.PlayerDao;
import com.evoker.domain.Judge;
import com.evoker.domain.Login;
import com.evoker.domain.Organizer;
import com.evoker.domain.Player;


@Service
public class AuthService {
	public Login authorizeLogin(String username, String password) {
		LoginDao ldao = new LoginDao();
		return ldao.getLoginByUserPass(username, password);
	}
	public Player authorizePlayer(Login login) {		
		PlayerDao pdao = new PlayerDao();
		return pdao.getPlayerUserPass(login);
	}
	public Organizer authorizeOrganizer(Login login){
		OrganizerDao odao = new OrganizerDao();
		return odao.getOrganizerUserPass(login);
	}
	public Judge authorizeJudge(Login login) {
		JudgeDao jdao = new JudgeDao();
		return jdao.getJudgeUserPass(login);
	}
}
