package com.WorldCup.FootBallTeam.Brazil.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.WorldCup.FootBallTeam.Brazil.api.Dao.BrazilDao;
import com.WorldCup.FootBallTeam.Brazil.api.Entity.TeamBrazil;

@Service
public class BrazilTeamService {
	@Autowired
	BrazilDao dao;

	public List<TeamBrazil> getAllPlayer() {
	return	dao.getAllPlayer();
	}

	public TeamBrazil getplyaerbyid(int jerseyno) {
		return dao.getplyaerbyid(jerseyno);
		
	}

	public String insertplayer(TeamBrazil team) {
	String string=	dao.insertplayer(team);
	return string;
	}

	public String deleteplayer(int jerseyno) {
		String string= dao.deleteplayer(jerseyno);
		
		return string;
	}

	public String updateplayer(TeamBrazil team) {
		String string=	dao.updateplayer(team);
		return string;
	}
	

}
