package METIER;

import java.util.*;

import com.mysql.jdbc.Extension;


public class Commande {
  
   private int idCommande;
 
   private java.sql.Date DateCmd;
   
   public java.util.Collection ligneDeCommande;
  
   public Client client;
   
   
  
   public Client getClient() {
      return client;
   }
   
  
   public void setClient(Client newClient) {
      if (this.client == null || !this.client.equals(newClient))
      {
         if (this.client != null)
         {
            Client oldClient = this.client;
            this.client = null;
            oldClient.removeCommande(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addCommande(this);
         }
      }
   }


public int getIdCommande() {
	return idCommande;
}


public void setIdCommande(int idCommande) {
	this.idCommande = idCommande;
}







public java.sql.Date getDateCmd() {
	return DateCmd;
}


public void setDateCmd(java.sql.Date dateCmd) {
	DateCmd = dateCmd;
}


public java.util.Collection getLigneDeCommande() {
	return ligneDeCommande;
}


public void setLigneDeCommande(java.util.Collection ligneDeCommande) {
	this.ligneDeCommande = ligneDeCommande;
}

}