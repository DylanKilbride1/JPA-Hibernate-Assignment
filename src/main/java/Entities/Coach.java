package Entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@NamedQueries({
				@NamedQuery(name = "Coach.viewAllCoaches", query = "SELECT c FROM Coach c")
})

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

	public Coach() {
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
