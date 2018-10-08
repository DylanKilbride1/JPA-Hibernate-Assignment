package Entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@NamedQueries({
				@NamedQuery(name = "Club.viewAllClubs", query = "SELECT c FROM Club c")
})

@Entity
public class Club {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "club_id")
	private int clubId;
	@Column(name = "club_name")
	private String clubName;
	@OneToMany
	@JoinColumn(name = "team_id")
	private List<Team> teams = new ArrayList<Team>();

	public Club(int clubId, String clubName) {
		this.clubId = clubId;
		this.clubName = clubName;
	}

	public Club() {
	}

	public int getclubId() {
		return clubId;
	}

	public void setclubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
}
