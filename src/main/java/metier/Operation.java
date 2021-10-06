package metier;
import java.util.*;

public class Operation {
	
	public ArrayList <produit> tab ;

	public Operation() {
		// TODO Auto-generated constructor stub
	}
	public void ajouter (produit p) {
		tab.add(p);
	}
	public void Afficher () {
		for (int i= 0 ; i<tab.size() ; i++)
		{
			System.out.println("ID :"+ tab.get(i).getID()+
				"libelle:"+tab.get(i).getLibelle() +
				"designation:"+tab.get(i).getDesignation() 
				+"prix :"+Float. toString(tab.get(i).getPrix()) 
				+ "quantite"+Integer.toString(tab.get(i).getQuantite())
				+ "etat"+tab.get(i).getEtat());
	    }
	}
    
}













