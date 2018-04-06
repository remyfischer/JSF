package org.ema;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SelectedPizza implements Serializable{

	private Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		
		this.pizza=pizza;
		
	}

}