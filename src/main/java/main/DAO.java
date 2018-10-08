package main;

import Entities.Club;
import Entities.Coach;
import Entities.Player;
import Entities.Team;
import Persistence.PersistenceUtil;

import java.util.List;

public class DAO {
	public static void main(String[] args){
		DAO dao = new DAO();
	}

	public DAO() {
		createClub("Naomh Mearnog", 1);
		createTeam(1, "Minor Hurlers");
		createPlayer(1, 18, 929292929);
		createCoach(1, "Dylan@gmail.com");
		viewClubs();
		viewCoaches();
		viewPlayers();
		viewTeams();
	}

	public void createClub(String clubName, int clubId) {
		Club club = new Club(clubId, clubName);
		PersistenceUtil.persist(club);
		System.out.println("Club Added.. Name: " + clubName + ", ID " + clubId);
	}

	public void createTeam(int teamId, String teamName) {
		Team team = new Team(teamId, teamName);
		PersistenceUtil.persist(team);
		System.out.println("Team Added.. Name: " + teamName + ", ID " + teamId);
	}

	public void createPlayer(int playerId, int playerAge, int playerPhoneNumber) {
		Player player = new Player(playerId, playerAge, playerPhoneNumber);
		PersistenceUtil.persist(player);
		System.out.println("Player Added.. ID: " + playerId + ", Age " + playerAge + ", Phone No. " + playerPhoneNumber);
	}

	public void createCoach(int coachId, String coachEmailAddress) {
		Coach coach = new Coach(coachId, coachEmailAddress);
		PersistenceUtil.persist(coach);
		System.out.println("Coach Added.. ID: " + coachId + ", Email " + coachEmailAddress);
	}

	public void viewTeams() {
		List<Team> teams = PersistenceUtil.viewAllTeams();
		for(Team team : teams){
			System.out.println("Team Name: " + team.getTeamName());
		}
	}

	public void viewClubs() {
		List<Club> clubs = PersistenceUtil.viewAllClubs();
		for(Club club : clubs){
			System.out.println("Club Name: " + club.getClubName());
		}
	}

	public void viewPlayers() {
		List<Player> players = PersistenceUtil.viewAllPlayers();
		for(Player player : players){
			System.out.println("Player ID: " + player.getPlayerId());
		}
	}

	public void viewCoaches() {
		List<Coach> coaches = PersistenceUtil.viewAllCoaches();
		for(Coach coach : coaches){
			System.out.println("Coach ID: " + coach.getCoachId());
		}
	}
}