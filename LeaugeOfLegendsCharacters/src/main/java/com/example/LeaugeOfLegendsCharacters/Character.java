package com.example.LeaugeOfLegendsCharacters;

public class Character {
	String name;
	String status;
	String role;
	String difficulty;
	public Character(String name,String status,String role,String difficulty) {
		
		this.name=name;
		this.status=status;
		this.role=role;
		this.difficulty=difficulty;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		role = role;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	

}
