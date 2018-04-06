package org.ema;
import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Named
@SessionScoped
public class Controller implements Serializable{
	private static Logger LOGGER = Logger.getLogger(Controller.class);
	private String name;
	private double prix;
	private ArrayList<Pizza> ArrayPizza = new ArrayList();
	

	public String commande() {
		LOGGER.infof("commande une %s", name);
		return null;
	}
	
	@Inject
	private SelectedPizza selectedPizza;
	
	@PostConstruct
	public void initPizza(){
		
		this.ArrayPizza.add(new Pizza(1, "Reine", 7.10));
		this.ArrayPizza.add(new Pizza(2, "Napolitaine", 7.50));
		this.ArrayPizza.add(new Pizza(3, "Quatre fromages", 7.80));

		
	}
	
	public String modifier(Pizza pizza) {
		
		selectedPizza.setPizza(pizza);
		return "modifpizza";
		
	}
	
	public void ajoutPizza(){
		
		this.ArrayPizza.add(new Pizza(0, name, prix));
		
	}
	
	public String cancel(){
		
		return "pizzeria";
		
	}
	
	public String edit(){
		selectedPizza.getPizza().setNom(name);
		selectedPizza.getPizza().setPrix(prix);
		return "pizzeria";
		
	}
	
	public void initialiser(){
		
		
		
	}
	
	public void supprimer(){
		
		this.ArrayPizza.remove(selectedPizza);
		
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