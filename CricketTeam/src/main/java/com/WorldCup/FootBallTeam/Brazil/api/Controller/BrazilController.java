package com.WorldCup.FootBallTeam.Brazil.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WorldCup.FootBallTeam.Brazil.api.Entity.TeamBrazil;
import com.WorldCup.FootBallTeam.Brazil.api.Service.BrazilTeamService;

@RestController
@RequestMapping("/api")
public class BrazilController {
	
	@Autowired
	BrazilTeamService service;
	
	
	@GetMapping("/all")
	public List<TeamBrazil> getAllPlayer(){
		List<TeamBrazil> list=service.getAllPlayer();
		return list;
	}
	
	@GetMapping("player/{jerseyno}")
	public TeamBrazil getplyaerbyid(@PathVariable int jerseyno)
	{
		TeamBrazil player = service.getplyaerbyid(jerseyno);
		return player;
	}
	
	@PostMapping("/add")
	public String insertplayer(@RequestBody TeamBrazil team)
	{
		String string= service.insertplayer(team);
		return string;
	}
	
	@DeleteMapping("/delete/{jerseyno}")
	public String deleteplayer(@PathVariable int jerseyno)
	{
		String string= service.deleteplayer(jerseyno);
		return string;
	}
	
	@PutMapping("/update")
	public String updateplayer(@RequestBody TeamBrazil team)
	{
		String string= service.updateplayer(team);
		return string;
	}

}
