

import java.util.*;

/** @pdOid 61e52ae1-21c0-412c-90c8-7e6cbed4477b */
public class Categorie {
   /** @pdOid 47596009-dc26-4053-b980-df8225edca6c */
   public int idCategorie;
   /** @pdOid bc777df9-2cf4-4219-a56c-a18ce613634b */
   public java.lang.String libelleCat;
   
   /** @pdRoleInfo migr=no name=Article assc=appartient coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Article> article;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Article> getArticle() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArticle() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArticle */
   public void setArticle(java.util.Collection<Article> newArticle) {
      removeAllArticle();
      for (java.util.Iterator iter = newArticle.iterator(); iter.hasNext();)
         addArticle((Article)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArticle */
   public void addArticle(Article newArticle) {
      if (newArticle == null)
         return;
      if (this.article == null)
         this.article = new java.util.HashSet<Article>();
      if (!this.article.contains(newArticle))
      {
         this.article.add(newArticle);
         newArticle.setAppartient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldArticle */
   public void removeArticle(Article oldArticle) {
      if (oldArticle == null)
         return;
      if (this.article != null)
         if (this.article.contains(oldArticle))
         {
            this.article.remove(oldArticle);
            oldArticle.setAppartient((Categorie)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArticle() {
      if (article != null)
      {
         Article oldArticle;
         for (java.util.Iterator iter = getIteratorArticle(); iter.hasNext();)
         {
            oldArticle = (Article)iter.next();
            iter.remove();
            oldArticle.setAppartient((Categorie)null);
         }
      }
   }

}