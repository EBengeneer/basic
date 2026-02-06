package resto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.PlatNotDisponible;

public class Restaurant {
	
	private int id;
	private String nom;
	private String adresse;
    private List<Plat> plats;
    private List<Client> clients;
    private Map<Client, Plat> commandes;
    
	public Restaurant() {
		
		this.plats=new ArrayList<Plat>();
		this.clients=new ArrayList<Client>();
		this.commandes=new HashMap<Client, Plat>();
	}

	public Restaurant(int id, String nom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.plats=new ArrayList<Plat>();
		this.clients=new ArrayList<Client>();
		this.commandes=new HashMap<Client, Plat>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Plat> getPlats() {
		return plats;
	}

	public void setPlats(List<Plat> plats) {
		this.plats = plats;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Map<Client, Plat> getCommandes() {
		return commandes;
	}

	public void setCommandes(Map<Client, Plat> commandes) {
		this.commandes = commandes;
	}
	
	public int nombreClients(String prenom) {
		
		int nbrCl=0;
		for (Client c : clients) {
			if (c.getPrenom().equals(prenom)) {
				nbrCl++;
			}
			
		}
		
		return nbrCl;
	}

	public void platExist(Plat p) throws PlatNotDisponible {
		
		boolean exist=false;
		for (Plat plt : plats) {
			
			if (plt.equals(p)) {
			   exist=true;
			}
			
		}
		
		if (!exist) {
			throw new PlatNotDisponible();
			
		}
		
		
		
		
	}
	
	public void AjouterPlat(Plat p) {
		if (!this.plats.contains(p)) {
			this.plats.add(p);
		}else {
			System.out.println("Plat deja exist");
		}
		
	}
	public void AjouterClient(Client c) {
		if (!this.clients.contains(c)) {
			this.clients.add(c);
		}else {
			System.out.println("client deja exist");
		}
		
	}
	
	public void ajouterCommande(Client c ,Plat p) {
		
		if (!this.commandes.containsKey(c)) {
			this.commandes.put(c, p);
		}else {
			System.out.println("Ce Client deja effectue une commande");
		}
		
	}
	
	public HashMap<String, String> infosCommande() {
		HashMap<String, String> infos=new HashMap<String, String>();
		for (Client c : this.commandes.keySet()) {
			
			Plat p= this.commandes.get(c);
			
			infos.put(c.getNom()+" "+c.getPrenom(), p.getNom());
			
			
		}
		
		return infos;
		
	}
	
	
	public void TrierParPrixSort(){
		Collections.sort(this.plats, new Comparator<Plat>() {

			@Override
			public int compare(Plat p1, Plat p2) {
				// TODO Auto-generated method stub
				return (int) (p1.getPrix()-p2.getPrix());
			}
		});
	}
	
	public List<Plat> TrierParPrix(){
		
		Plat temp;
		for (int i = 0; i < this.plats.size(); i++) {
			for (int j = i+1; j < this.plats.size(); j++) {
				
				if (this.plats.get(i).getPrix()>this.plats.get(j).getPrix()) {
					temp=this.plats.get(i);
					this.plats.set(i, this.plats.get(j));
					this.plats.set(j, temp);
				}
				
			}
		}
		
		
		
		return this.plats;
	}
	
	
	
	
	
    
    
    
	

}
