package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Club {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "club_id")
	private int clubId;
	@Column(name = "club_name")
	private String clubName;

	public Club(int clubId, String clubName) {
		this.clubId = clubId;
		this.clubName = clubName;
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
