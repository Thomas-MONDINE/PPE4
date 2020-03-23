/***********************************************************************
 * Module:  Client.java
 * Author:  W540
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid 7facea3a-1e59-4b2a-a773-41e24495bae9 */
public class Client {
   /** @pdOid 718a643d-43dc-42bc-bac0-3acbd2575c53 */
   public int idClient;
   /** @pdOid b7adb80b-9459-4f57-bc69-fd39c3daff2b */
   public String nom;
   /** @pdOid c1aed4f9-6796-4eaf-afbd-f0141f50bc60 */
   public String prenom;
   /** @pdOid 591b2d63-d410-4370-8b8b-52229eb515c8 */
   public String raisonSociale;
   /** @pdOid db2ec908-c6bb-4ca9-a027-7952baedd555 */
   public String adresse;
   /** @pdOid 72b10151-c1e2-4ba5-9920-075cbe9f608a */
   public String codePostale;
   /** @pdOid 764ec4e2-64e2-4f98-b861-83dc202773aa */
   public String ville;
   /** @pdOid 0f7b516a-b3ec-42b8-8624-e172ae2a1021 */
   public String tel;
   
   /** @pdRoleInfo migr=no name=Commande assc=commander coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Commande> commande;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Commande> getCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommande */
   public void setCommande(java.util.Collection<Commande> newCommande) {
      removeAllCommande();
      for (java.util.Iterator iter = newCommande.iterator(); iter.hasNext();)
         addCommande((Commande)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommande */
   public void addCommande(Commande newCommande) {
      if (newCommande == null)
         return;
      if (this.commande == null)
         this.commande = new java.util.HashSet<Commande>();
      if (!this.commande.contains(newCommande))
      {
         this.commande.add(newCommande);
         newCommande.setClient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCommande */
   public void removeCommande(Commande oldCommande) {
      if (oldCommande == null)
         return;
      if (this.commande != null)
         if (this.commande.contains(oldCommande))
         {
            this.commande.remove(oldCommande);
            oldCommande.setClient((Client)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommande() {
      if (commande != null)
      {
         Commande oldCommande;
         for (java.util.Iterator iter = getIteratorCommande(); iter.hasNext();)
         {
            oldCommande = (Commande)iter.next();
            iter.remove();
            oldCommande.setClient((Client)null);
         }
      }
   }

}