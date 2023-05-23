package com.WorldCup.FootBallTeam.Brazil.api.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.WorldCup.FootBallTeam.Brazil.api.Entity.TeamBrazil;

@Repository
public class BrazilDao {
	@Autowired
	SessionFactory factory;

	public List<TeamBrazil> getAllPlayer() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TeamBrazil.class);
		List<TeamBrazil> list = criteria.list();
		session.close();
		return list;
	}

	public TeamBrazil getplyaerbyid(int jerseyno) {
		Session session = factory.openSession();
		TeamBrazil player = session.get(TeamBrazil.class, jerseyno);
		session.close();
		return player;
	}

	public String insertplayer(TeamBrazil team) {
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(team);
		tx.commit();
		
		session.close();
		return "Data Insert SuccessFully";
	}

	public String deleteplayer(int jerseyno) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		TeamBrazil player = session.get(TeamBrazil.class, jerseyno);
		session.delete(player);
		tx.commit();
		session.close();
		
		return "Data Delete Sucessfully";
	}

	public String updateplayer(TeamBrazil team) {
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(team);
		tx.commit();
		session.close();
		return "Data update SuccessFully";
	}

}
