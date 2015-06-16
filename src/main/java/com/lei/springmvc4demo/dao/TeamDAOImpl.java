package com.lei.springmvc4demo.dao;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.lei.springmvc4demo.init.EntityManagerUtil;
import com.lei.springmvc4demo.model.Team;

//@Repository
public class TeamDAOImpl implements TeamDAO {
	
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	private Session getCurrentSession() {
//		
//		return sessionFactory.getCurrentSession();
//	}

	public void addTeam(Team team) {
		   EntityManager entityManager = EntityManagerUtil.getEntityManager();
	        try {
	            entityManager.getTransaction().begin();
	            entityManager.persist(team);
	            entityManager.getTransaction().commit();
	        }  catch (Exception e) {
	            entityManager.getTransaction().rollback();
	        }finally {
	            entityManager.close();
	        }
	        
	}

	public void updateTeam(Team team) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		 try {
			 entityManager.getTransaction().begin();
		entityManager.merge(team);
		entityManager.getTransaction().commit();
	        }  catch (Exception e) {
	            entityManager.getTransaction().rollback();
	        }finally {
	            entityManager.close();
	        }
	        
		
	}

	public Team getTeam(int id) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		Team team = (Team) entityManager.find(Team.class, id);
		return team;
	}

	public void deleteTeam(int id) {
			
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			Team team = (Team) entityManager.find(Team.class, id);
		entityManager.remove(team);
		entityManager.getTransaction().commit();
    }  catch (Exception e) {
        entityManager.getTransaction().rollback();
    }finally {
        entityManager.close();
    }
	}

	@SuppressWarnings("unchecked")
	public List<Team> getTeams() {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		return entityManager.createQuery("from Team").getResultList();
	}

}
