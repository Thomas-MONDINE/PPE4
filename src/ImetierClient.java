package src;


import java.util.List;

public interface ImetierClient {
	
	public List<Client> getClientsParMotCle(String mc);
	public void addClient(Client c) ;

}
