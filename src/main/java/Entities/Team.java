package Entities;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

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
