

package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ModelLigneCmd {

	public Collection<LigneDeCommande> getLigneDeCommandesParIdCmd(int id) {
       Collection<LigneDeCommande> LigneDeCommandes= new ArrayList<LigneDeCommande>();
       Connection conn=BdConnection.getConnection();
       
       try {
		PreparedStatement ps= conn.prepareStatement("select * from LigneDeCommande "
				+ "where ID_COMMANDE=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			LigneDeCommande lcmd = new LigneDeCommande();
			
			ModelCommande modelcmd= new ModelCommande();
			ModelArticle modelArt= new ModelArticle();	
			lcmd.setCommande(modelcmd.getCommandesParIdCommande(rs.getInt("ID_COMMANDE")));
			lcmd.setArticle(modelArt.getArticlesParId(rs.getInt("ID_ARTICLE")));
			lcmd.setQuantite(rs.getInt("QUANTITE"));
			lcmd.setPrixUnitDate(rs.getDouble("PRIXUNITDATE"));
			LigneDeCommandes.add(lcmd);								
		}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

		return LigneDeCommandes;
	}
	
	
	
	

	
	public List<LigneDeCommande> findAll() {
	       List<LigneDeCommande> LigneDeCommandes= new ArrayList<LigneDeCommande>();
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from LigneDeCommande ");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				LigneDeCommande lcmd = new LigneDeCommande();
				
				ModelCommande modelcmd= new ModelCommande();
				ModelArticle modelArt= new ModelArticle();	
				lcmd.setCommande(modelcmd.getCommandesParIdCommande(rs.getInt("ID_COMMANDE")));
				lcmd.setArticle(modelArt.getArticlesParId(rs.getInt("ID_ARTICLE")));
				lcmd.setQuantite(rs.getInt("QUANTITE"));
				lcmd.setPrixUnitDate(rs.getDouble("PRIXUNITDATE"));
				LigneDeCommandes.add(lcmd);									
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return LigneDeCommandes;
		}
	
	

	/*@Override*/
	public void addLigneDeCommande(LigneDeCommande lcmd) {
		  Connection conn=BdConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LIGNEDECOMMANDE(ID_COMMANDE,ID_COMMANDE,QUANTITE,PRIXUNITDATE)"
					+ " VALUES(?,?,?,?,?,?)");
			ps.setInt(1, lcmd.getCommande().getIdCommande());
			ps.setInt(2, lcmd.getArticle().getIdArticle());
			ps.setInt(3, lcmd.getQuantite());
			ps.setDouble(4, lcmd.getPrixUnitDate());
			
			
			  ps.executeUpdate();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public void deleteLigneDeCommande(int idCmd , int idArt ) {
	     
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("DELETE from LigneDeCommande WHERE ID_Commande=? "
					+ "AND ID_ARTICLE=?");
			ps.setInt(1, idCmd);
			ps.setInt(1, idArt);
			ps.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			
		}
	
	public void deleteLigneDeCommande(LigneDeCommande lcmd) {
	     
		deleteLigneDeCommande(lcmd.getCommande().getIdCommande(), lcmd.getArticle().getIdArticle());
			
		}
	
	

}
