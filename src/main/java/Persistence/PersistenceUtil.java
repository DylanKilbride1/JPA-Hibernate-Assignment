package Persistence;

import Entities.Club;
import Entities.Coach;
import Entities.Player;
import Entities.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

public class PersistenceUtil implements Serializable {
	private static final long serialVersionUID = 1L;

	protected static EntityManagerFactory entityManagerFactory =
					Persistence.createEntityManagerFactory("gaaManagementSystem");

	public static void persist(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void remove(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Object mergedEntity = entityManager.merge(entity);
		entityManager.remove(mergedEntity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static Object merge(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
		return entity;
	}

	public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public static List<Team> viewAllTeams(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Team> teams = (List<Team>)
						entityManager.createNamedQuery("Team.viewAllTeams").getResultList();
		entityManager.close();
		return teams;
	}

	public static List<Club> viewAllClubs(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Club> clubs = (List<Club>)
						entityManager.createNamedQuery("Club.viewAllClubs").getResultList();
		entityManager.close();
		return clubs;
	}

	public static List<Player> viewAllPlayers(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Player> players = (List<Player>)
						entityManager.createNamedQuery("Player.viewAllPlayers").getResultList();
		entityManager.close();
		return players;
	}

	public static List<Coach> viewAllCoaches(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Coach> coaches = (List<Coach>)
						entityManager.createNamedQuery("Coach.viewAllCoaches").getResultList();
		entityManager.close();
		return coaches;
	}
}