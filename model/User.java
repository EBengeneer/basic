package model;

import java.util.List;

import exception.WrongPSWException;
import exception.WrongUserNameException;

public class User {
	
	private int idUser;
	private String nomComplet;
	private String role;
	private String username;
	private String password;
	public User() {
		
	}
	public User(int idUser, String nomComplet, String role, String username, String password) {
		this.idUser = idUser;
		this.nomComplet = nomComplet;
		this.role = role;
		this.username = username;
		this.password = password;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomComplet=" + nomComplet + ", role=" + role + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	public static boolean  verifierInfo(String login,String password,List<User> users) throws WrongUserNameException,WrongPSWException {
		
		boolean exist=false;
		
		
		for (User u : users) {
			
			if (u.getUsername().equals(login)) {
				if (u.getPassword().equals(password)) {
					exist=true;
					break;
				} else {
					throw new WrongPSWException();
				}
				
				
			} else {
				throw new WrongUserNameException();	
			}
			
		}
		return exist;
		
	}
	
	
	
	
	
	
	
	




}
