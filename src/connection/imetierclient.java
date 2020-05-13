package connection;

import java.util.List;

import METIER.Client;

public interface ImetierClient {
	
	public List<Client> getClientsParMotCle(String mc);
	public void addClient(Client c) ;

}
