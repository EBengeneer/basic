package resto;

public class Client {

	private int numCl;
	private String nom;
	private String prenom;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int numCl, String nom, String prenom) {
		super();
		this.numCl = numCl;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getNumCl() {
		return numCl;
	}
	public void setNumCl(int numCl) {
		this.numCl = numCl;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [numCl=" + numCl + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	public boolean equals(Client c) {
		
		return (this.numCl==c.getNumCl() && this.nom.equals(c.getNom()) && this.prenom.equals(c.getPrenom()) );
		
	}
	
	
	

}
