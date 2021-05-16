package com.express.transport.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Livraison {
    
	@Id
	@GeneratedValue
	private int id ;
	private String chauffeur ; 
	
	@OneToMany(mappedBy = "livraison")
	private Set<Colis> listcolis ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(String chauffeur) {
		this.chauffeur = chauffeur;
	}

	public Set<Colis> getListcolis() {
		return listcolis;
	}

	public void setListcolis(Set<Colis> listcolis) {
		this.listcolis = listcolis;
	}
	
	
}
