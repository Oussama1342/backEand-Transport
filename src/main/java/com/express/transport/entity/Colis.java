package com.express.transport.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Colis {
	
	@Id
	@GeneratedValue
	private int id ;
	
	private String emeteur ; 
	
	private String recepteur ;

	@ManyToOne
	private Livraison livraison ;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getEmeteur() {
		return emeteur;
	}

	public void setEmeteur(String emeteur) {
		this.emeteur = emeteur;
	}

	public String getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(String recepteur) {
		this.recepteur = recepteur;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	} 
	
	
	
	

}
