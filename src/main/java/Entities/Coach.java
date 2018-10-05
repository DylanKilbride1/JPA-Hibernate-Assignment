package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Coach {
	@Id @GeneratedValue(strategy = AUTO) @Column(name = "coach_id")
	private int coachId;
	@Column(name = "coach_email")
	private String coachEmailAddress;

	public Coach(int coachId, String coachEmailAddress) {
		this.coachId = coachId;
		this.coachEmailAddress = coachEmailAddress;
	}

	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public String getCoachEmailAddress() {
		return coachEmailAddress;
	}

	public void setCoachEmailAddress(String coachEmailAddress) {
		this.coachEmailAddress = coachEmailAddress;
	}
}
