/***********************************************************************
 * Module:  Article.java
 * Author:  W540
 * Purpose: Defines the Class Article
 ***********************************************************************/

import java.util.*;

public class Article {
   private int idArticle;
   private java.lang.String reference;
   private java.lang.String description;
   private int stock;
   private java.lang.String libelle;
   
   public java.util.Collection ligneDeCommande;
   public Categorie appartient;
   
   
   public Categorie getAppartient() {
      return appartient;
   }
   

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