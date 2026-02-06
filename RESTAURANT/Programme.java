package resto;

import java.time.LocalDateTime;

import exception.PlatNotDisponible;

public class Programme {

	public static void main(String[] args) {
		
		
		Client c1=new Client(1, "ALAOUI", "ISMAIL");
		Client c2=new Client(2, "KAMLI", "HOUDA");
		Client c3=new Client(2, "AHMADI", "KHALID");

		Plat p1=new Plat(1, "PIZZA ", "Fast Food", 130, LocalDateTime.now());
		Plat p2=new Plat(2, "TAJINE ", "Principal", 80, LocalDateTime.now());
		Plat p3=new Plat(3, "KOUSKOUS ", "Principal", 100, LocalDateTime.now());

		Restaurant r=new Restaurant(100, "Laayoune Resto", "Avenue Mekka");
		
		r.AjouterClient(c1);
		r.AjouterClient(c2);
		
		r.AjouterPlat(p1);
		r.AjouterPlat(p2);
		r.AjouterPlat(p3);
		
		r.ajouterCommande(c1, p2);
		r.ajouterCommande(c2, p1);
		r.ajouterCommande(c3, p3);
		
		System.out.println(r.nombreClients("ISMAIL"));
		
		try {
			r.platExist(p3);
			 System.out.println(r.infosCommande());  
			 System.out.println(r.getPlats());
			 System.out.println(r.TrierParPrix());
		} catch (PlatNotDisponible e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
