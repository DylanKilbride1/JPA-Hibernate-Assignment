package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Player {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "player_id")
	private int playerId;
	@Column(name = "player_age")
	private int playerAge;
	@Column(name = "player_phone_number")
	private long playerPhoneNumber;

	public Player(int playerId, int playerAge, long playerPhoneNumber) {
		this.playerId = playerId;
		this.playerAge = playerAge;
		this.playerPhoneNumber = playerPhoneNumber;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public long getPlayerPhoneNumber() {
		return playerPhoneNumber;
	}

	public void setPlayerPhoneNumber(long playerPhoneNumber) {
		this.playerPhoneNumber = playerPhoneNumber;
	}
}
