package src;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ModelArticle {

	public Collection<Article> getArticlesParMotCle(String mc) {
       Collection<Article> articles= new ArrayList<Article>();
       Connection conn=BdConnection.getConnection();
       mc=mc.toUpperCase();
       try {
		PreparedStatement ps= conn.prepareStatement("select * from ARTICLE "
				+ "where UPPER(LIBELLE) LIKE ?"
				+ "OR UPPER(REFERENCE) LIKE ?");
		ps.setString(1, "%"+mc+"%");
		ps.setString(2, "%"+mc+"%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Article art = new Article();
			
			ModelCategorie model= new ModelCategorie();			
			art.setIdArticle(rs.getInt("ID_ARTICLE"));
			art.setAppartient(model.getCategoriesParId(rs.getInt("ID_ARTICLE")));
			art.setReference(rs.getString("REFERENCE"));
			art.setDescription(rs.getString("DESCRIPTION"));
			art.setStock(rs.getInt("STOCK"));
			art.setLibelle(rs.getString("LIBELLE"));
			art.setPrix(rs.getDouble("PRIX"));
			articles.add(art);								
		}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

		return articles;
	}
	
	
	public Article getArticlesParId(int id) {
	      
	       Connection conn=BdConnection.getConnection();
	       Article art = new Article();
	     
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from ARTICLE "
					+ "where ID_ARTICLE=?");
			ps.setInt(1, id);
		
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
							
				ModelCategorie model= new ModelCategorie();			
				art.setIdArticle(rs.getInt("ID_ARTICLE"));
				art.setAppartient(model.getCategoriesParId(rs.getInt("ID_ARTICLE")));
				art.setReference(rs.getString("REFERENCE"));
				art.setDescription(rs.getString("DESCRIPTION"));
				art.setStock(rs.getInt("STOCK"));
				art.setLibelle(rs.getString("LIBELLE"));
				art.setPrix(rs.getDouble("PRIX"));
											
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return art;
		}
	
	public List<Article> findAll() {
	       List<Article> articles= new ArrayList<Article>();
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from Article ");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Article art = new Article();
				
				ModelCategorie model= new ModelCategorie();			
				art.setIdArticle(rs.getInt("ID_ARTICLE"));
				art.setAppartient(model.getCategoriesParId(rs.getInt("ID_ARTICLE")));
				art.setReference(rs.getString("REFERENCE"));
				art.setDescription(rs.getString("DESCRIPTION"));
				art.setStock(rs.getInt("STOCK"));
				art.setLibelle(rs.getString("LIBELLE"));
				art.setPrix(rs.getDouble("PRIX"));
				articles.add(art);								
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return articles;
		}
	
	

	/*@Override*/
	public void addArticle(Article art) {
		  Connection conn=BdConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO ARTICLE(ID_CATEGORIE,REFERENCE,DESCRIPTION,STOCK,LIBELLE,PRIX)"
					+ " VALUES(?,?,?,?,?,?)");
			ps.setInt(1, art.getAppartient().getIdCategorie());
			ps.setString(2, art.getReference());
			ps.setString(3, art.getDescription());
			ps.setInt(4, art.getStock());
			ps.setString(5, art.getLibelle());
			ps.setDouble(6, art.getPrix());
			
			
			  ps.executeUpdate();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public void deleteArticle(int id) {
	     
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("DELETE from Article WHERE ID_Article=? ");
			ps.setInt(1, id);
			ps.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			
		}
	
	public void deleteArticle(Article art) {
	     
		deleteArticle(art.getIdArticle());
			
		}
	
	

}
