package com.evoker.service;

import org.springframework.stereotype.Service;

import com.evoker.dao.CharacterDao;
import com.evoker.dao.PlayerDao;
import com.evoker.domain.EVOCharacter;
import com.evoker.domain.LineupEdit;
import com.evoker.domain.Player;


@Service
public class PlayerService {
	CharacterDao cdao = new CharacterDao();
	PlayerDao pdao = new PlayerDao();

	public Player addCharacterToLineup(String charname, Player player) {
			EVOCharacter evochar = null;
			evochar = cdao.getCharacterByName(charname);
			System.out.println(evochar);
			Player player2 = pdao.addCharacterToLineup(evochar, player);
			return player2;
	}
	
	public Player editCharacterInLineup(LineupEdit ledit) {
		EVOCharacter char1 = null;
		EVOCharacter char2 = null;
		Player player = null;
		char1 = cdao.getCharacterByName(ledit.getOldCharacterName());
		char2 = cdao.getCharacterByName(ledit.getNewCharacterName());
		player = pdao.editCharacterInLineup(char1, char2, ledit.getPlayer());
		return player;
	}
	
}
