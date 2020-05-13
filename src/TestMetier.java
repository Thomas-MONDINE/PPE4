package src;

import java.util.Collection;


public class TestMetier {

	public static void main(String[] args) {
	 ModelClient metier= new ModelClient();
	 Collection<Client> clients = metier.getClientsParMotCle("mar");
	 
	 for (Client c : clients)
		 System.out.println(c.getNom());
	}
}
