package com.WorldCup.FootBallTeam.Brazil.api.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeamBrazil {
	
   @Id
   private int jerseyno;
   private String playername;
   private String club;
   private int age;
   private String position;
   
   public TeamBrazil() {
	   super();
	   // TODO Auto-generated constructor stub
   }
   
public TeamBrazil(int jerseyno, String playername, String club, int age, String position) {
	super();
	this.jerseyno = jerseyno;
	this.playername = playername;
	this.club = club;
	this.age = age;
	this.position = position;
}
public int getJerseyno() {
	return jerseyno;
}
public void setJerseyno(int jerseyno) {
	this.jerseyno = jerseyno;
}
public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getClub() {
	return club;
}
public void setClub(String club) {
	this.club = club;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Brazil [jerseyno=" + jerseyno + ", playername=" + playername + ", club=" + club + ", age=" + age
			+ ", position=" + position + "]";
}

   
   
   
	

}
