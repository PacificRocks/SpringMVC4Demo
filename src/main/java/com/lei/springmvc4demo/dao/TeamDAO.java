package com.lei.springmvc4demo.dao;

import java.util.List;

import com.lei.springmvc4demo.model.Team;

public interface TeamDAO {
	
	public void addTeam(Team team);
	public void updateTeam(Team team);
	public Team getTeam(int id);
	public void deleteTeam(int id);
	public List<Team> getTeams();

}
