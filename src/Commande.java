

import java.util.*;

/** @pdOid d23f53b4-ff83-4fcf-9dc5-9c63cf9dc5ba */
public class Commande {
   /** @pdOid 7e3c6b68-d77b-4885-b563-959125033bdb */
   public int idCommande;
   /** @pdOid 9effcd92-5bec-41a4-aaec-c689b47c60a2 */
   public java.util.Date date;
   
   public java.util.Collection ligneDeCommande;
   /** @pdRoleInfo migr=no name=Client assc=commander mult=1..1 side=A */
   public Client client;
   
   
   /** @pdGenerated default parent getter */
   public Client getClient() {
      return client;
   }
   
   /** @pdGenerated default parent setter
     * @param newClient */
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

}