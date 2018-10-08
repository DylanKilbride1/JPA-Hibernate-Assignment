package Entities;

import javax.persistence.*;
import java.util.List;
import static javax.persistence.GenerationType.AUTO;

@NamedQueries({
				@NamedQuery(name = "Team.viewAllTeams", query = "SELECT c FROM Team c")
})

@Entity
public class Team {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "team_id")
	private int teamId;
	@Column(name = "team_name")
	private String teamName;
	@OneToMany
	private List<Coach> coaches;
	@OneToMany
	private List<Player> players;

	public Team(int teamId, String teamName) {
		this.teamId = teamId;
		this.teamName = teamName;
	}

	public Team() {

	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
