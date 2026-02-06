package resto;

import java.time.LocalDateTime;

public class Plat  {
	
	private int numPlat;
	private String nom;
	private String type;
	private double prix;
	private LocalDateTime dateAjout;
	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plat(int numPlat, String nom, String type, double prix, LocalDateTime dateAjout) {
		super();
		this.numPlat = numPlat;
		this.nom = nom;
		this.type = type;
		this.prix = prix;
		this.dateAjout = dateAjout;
	}
	public int getNumPlat() {
		return numPlat;
	}
	public void setNumPlat(int numPlat) {
		this.numPlat = numPlat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public LocalDateTime getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(LocalDateTime dateAjout) {
		this.dateAjout = dateAjout;
	}
	@Override
	public String toString() {
		return "Plat [numPlat=" + numPlat + ", nom=" + nom + ", type=" + type + ", prix=" + prix + ", dateAjout="
				+ dateAjout + "]";
	}


	


}
