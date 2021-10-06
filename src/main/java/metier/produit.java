package metier;

public class produit {

	private String ID ;
	private String libelle;
	private String designation ;
	private float prix;
	private int quantite;
	private String etat;
	
	public produit(String ID, String libelle , String designation , float prix,int quantite,String etat) {
		this.ID = ID ;
		this.libelle = libelle;
		this.designation = designation ;
		this.prix = prix;
		this.quantite = quantite ;
		this.etat = etat ;
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}



	public int getQuantite() {
		return quantite;
	}



	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	

}
