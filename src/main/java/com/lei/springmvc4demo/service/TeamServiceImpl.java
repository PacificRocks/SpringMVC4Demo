package com.lei.springmvc4demo.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lei.springmvc4demo.dao.TeamDAO;
import com.lei.springmvc4demo.dao.TeamDAOImpl;
import com.lei.springmvc4demo.model.Team;

//@Service
//@Transactional
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDAO teamDAO;

	public void updateTeam(Team team) {
	//	TeamDAO teamDAO  =  new TeamDAOImpl();
		teamDAO.updateTeam(team);
	}

	public Team getTeam(int id) {
	//	TeamDAO teamDAO  =  new TeamDAOImpl();
		return teamDAO.getTeam(id);
	}

	public void deleteTeam(int id) {
	//	TeamDAO teamDAO  =  new TeamDAOImpl();
		teamDAO.deleteTeam(id);
	}

	public List<Team> getTeams() {
	//	TeamDAO teamDAO  =  new TeamDAOImpl();
		return teamDAO.getTeams();  
		
	}

	public void addTeam(Team team) {
	//	TeamDAO teamDAO  =  new TeamDAOImpl();
		teamDAO.addTeam(team);		
	}
}
