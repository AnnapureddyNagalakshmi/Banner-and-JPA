package com.DbJpa.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CRICKET_PLAYERS")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Player {
	@Id
	@Column(name="PLAYER_ID")
	private Integer playerId;
	@Column(name="PLAYER_NAME")
	private String playerName;
	@Column(name="PLAYER_AGE")
	private Integer playerAge;
	@Column(name="PLAYER_LOCATION")
	private String location;
	public Player(Integer playerId, String playerName, Integer playerAge, String location) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.location = location;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, playerAge, playerId, playerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(location, other.location) && Objects.equals(playerAge, other.playerAge)
				&& Objects.equals(playerId, other.playerId) && Objects.equals(playerName, other.playerName);
	}
	

}
