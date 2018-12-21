package com.evoker.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.evoker.dao.CharacterDao;
import com.evoker.dao.JudgeDao;
import com.evoker.dao.LoginDao;
import com.evoker.dao.OrganizerDao;
import com.evoker.dao.PlayerDao;
import com.evoker.domain.EVOCharacter;
import com.evoker.domain.Judge;
import com.evoker.domain.Login;
import com.evoker.domain.Organizer;
import com.evoker.domain.Player;

public class LoginTesting {

	@Test
	public void test() {
		LoginDao ld = new LoginDao();
		Login testLogin = ld.getLoginByUserPass("ramsey", "yeschef");
		assertNotNull(testLogin);
		System.out.println(testLogin);
	}
	@Test
	public void test2()
	{
		JudgeDao jd = new JudgeDao();
		Judge testJudge = jd.getJudgeUserPass(jd.getLoginByUserPass("ramsey", "yeschef"));
		assertNotNull(testJudge);
		System.out.println(testJudge);
	};
	@Test
	public void test3()
	{
		PlayerDao pd = new PlayerDao();
		Player testPlayer = pd.getPlayerUserPass(pd.getLoginByUserPass("daigo", "pass"));
		assertNotNull(testPlayer);
		System.out.println(testPlayer);
	};
	@Test
	public void test4()
	{
		OrganizerDao od = new OrganizerDao();
		Organizer testOrganizer = od.getOrganizerUserPass(od.getLoginByUserPass("austin", "pass"));
		assertNotNull(testOrganizer);
		System.out.println(testOrganizer);
	};
	@Test
	public void test5()
	{
		CharacterDao cdao = new CharacterDao();
		EVOCharacter evochar = null;
		evochar = cdao.getCharacterByName("Mario");
		assertNotNull(evochar);
		System.out.println(evochar);
	}
	@Test
	public void test6()
	{
		CharacterDao cdao = new CharacterDao();
		EVOCharacter evochar = null;
		evochar = cdao.getCharacterByName("Mario");
		PlayerDao pd = new PlayerDao();
		Player testPlayer = pd.getPlayerUserPass(pd.getLoginByUserPass("daigo", "pass"));
		pd.addCharacterToLineup(evochar, testPlayer);
		assertFalse(testPlayer.getLineup().isEmpty());
		System.out.println(testPlayer.getLineup());
	}
	@Test
	public void test7()
	{
		CharacterDao cdao = new CharacterDao();
		EVOCharacter evochar1 = null;
		EVOCharacter evochar2 = null;
		evochar1 = cdao.getCharacterByName("Link");
		evochar2 = cdao.getCharacterByName("Zelda");
		PlayerDao pd = new PlayerDao();
		Player testPlayer = pd.getPlayerUserPass(pd.getLoginByUserPass("daigo", "pass"));
		pd.editCharacterInLineup(evochar1, evochar2, testPlayer);
		assertFalse(testPlayer.getLineup().isEmpty());
		System.out.println(testPlayer.getLineup());
	}
	

}
