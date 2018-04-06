package org.ema;

public class Pizza {
	
	private String nom;
	private double prix;
	private int id;
	
	public Pizza(int id, String nom, double prix){
		
		this.setId(id);
		this.setNom(nom);
		this.setPrix(prix);
		
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
