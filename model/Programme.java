package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exception.WrongPSWException;
import exception.WrongUserNameException;
import model.User;

public class Programme {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//List Of Users
		List<User> users=new ArrayList<User>();
		User u1=new User(1, "KAMAL ALI", "admin", "kali", "kali1234");
		User u2=new User(2, "NISRINE SOBHI", "user", "nsobhi", "nsobhi2026");

		users.add(u1);
		users.add(u2);
		
		/*
		for (User u : users) {
			System.out.println("le nom est :"+u.getNomComplet()+" et votre role est "+u.getRole());
			
		}
		
		 System.err.println(users.get(1).getNomComplet()); 
		
	
		
		
		Map<String, User> listsUsers=new HashMap<String, User>();
		listsUsers.put("user1", u1);
		listsUsers.put("user2", u2);
		
		// affichage des valeurs
		for (User u : listsUsers.values()) {
			System.out.println("le nom est :"+u.getNomComplet()+" et votre role est "+u.getRole());

		}
		// affichage des cles et les valeurs
		
		for (String s : listsUsers.keySet()) {
			System.out.println(s);
			System.out.println(listsUsers.get(s));

		}
			*/
		System.out.println("Page d'aithentification");
		System.out.println("Saisir le nom d 'utilisateur");
		String login=sc.nextLine();
		System.out.println("Saisir le Password");
		String password=sc.nextLine();
		
		 try {
			boolean result= User.verifierInfo(login, password, users);
			if (result) {
				System.out.println("Authentification Reussi");
				
			}
		} catch (WrongUserNameException e) {
			e.printStackTrace();
		} catch (WrongPSWException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
