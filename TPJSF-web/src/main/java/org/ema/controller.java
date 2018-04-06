package org.ema;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Named
@RequestScoped
public class controller {
	private static Logger LOGGER = Logger.getLogger(controller.class);
	private String name;

	public String commande() {
		LOGGER.infof("commande une %s", name);
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}