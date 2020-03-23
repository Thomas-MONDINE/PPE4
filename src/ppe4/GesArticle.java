/***********************************************************************
 * Module:  Article.java
 * Author:  W540
 * Purpose: Defines the Class Article
 ***********************************************************************/

import java.util.*;

/** @pdOid 6528518a-f8ce-48e4-ad21-2aad390b2c96 */
public class Article {
   /** @pdOid 4726e149-95b6-4f49-b08f-de8b5bdc7ea4 */
   public int idArticle;
   /** @pdOid 4daa9e83-b9ee-4d7c-b528-2feeefdbf871 */
   public String reference;
   /** @pdOid e32315c2-b51a-4d08-aefb-c5f80881afe7 */
   public String description;
   /** @pdOid 6e1c24e5-a1f8-4793-88d3-387b513c2536 */
   public int stock;
   /** @pdOid 6d739732-20fb-47b0-9d83-9640cfd0c58c */
   public String libelle;
   
   public java.util.Collection ligneDeCommande;
   /** @pdRoleInfo migr=no name=Categorie assc=appartient mult=1..1 side=A */
   public Categorie appartient;
   
   
   /** @pdGenerated default parent getter */
   public Categorie getAppartient() {
      return appartient;
   }
   
   /** @pdGenerated default parent setter
     * @param newCategorie */
   public void setAppartient(Categorie newCategorie) {
      if (this.appartient == null || !this.appartient.equals(newCategorie))
      {
         if (this.appartient != null)
         {
            Categorie oldCategorie = this.appartient;
            this.appartient = null;
            oldCategorie.removeArticle(this);
         }
         if (newCategorie != null)
         {
            this.appartient = newCategorie;
            this.appartient.addArticle(this);
         }
      }
   }

}