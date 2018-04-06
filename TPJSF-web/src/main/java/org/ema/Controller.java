package org.ema;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Named
@RequestScoped
public class Controller {
	private static Logger LOGGER = Logger.getLogger(Controller.class);
	private String name;
	private double prix;
	private ArrayList<Pizza> ArrayPizza;
	

	public String commande() {
		LOGGER.infof("commande une %s", name);
		return null;
	}
	
	public void initPizza(){
		
		this.ArrayPizza.add(new Pizza(1, "Reine", 7.10));
		this.ArrayPizza.add(new Pizza(2, "Napolitaine", 7.50));
		this.ArrayPizza.add(new Pizza(3, "Quatre fromages", 7.80));

		
	}
	
	public void modifier(Pizza pizza){
		
	}
	
	public void initialiser(){
		
	}
	
	public void supprimer(){
		
	}
	

	public String getName() {
		return name;
	}
	
	public double getPrix(){
		return prix;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrix(double prix){
		this.prix = prix;
	}

	public ArrayList<Pizza> getArrayPizza() {
		return ArrayPizza;
	}

	public void setArrayPizza(ArrayList<Pizza> arrayPizza) {
		ArrayPizza = arrayPizza;
	}
	
	
}