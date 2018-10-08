package Entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@NamedQueries({
				@NamedQuery(name = "Player.viewAllPlayers", query = "SELECT c FROM Player c")
})

@Entity
public class Player {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "player_id")
	private int playerId;
	@Column(name = "player_age")
	private int playerAge;
	@Column(name = "player_phone_number")
	private int playerPhoneNumber;

	public Player(int playerId, int playerAge, int playerPhoneNumber) {
		this.playerId = playerId;
		this.playerAge = playerAge;
		this.playerPhoneNumber = playerPhoneNumber;
	}

	public Player() {
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

	public void setPlayerPhoneNumber(int playerPhoneNumber) {
		this.playerPhoneNumber = playerPhoneNumber;
	}
}
