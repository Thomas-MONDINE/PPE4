package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ModelCommande {

	public Collection<Commande> getCommandesParIdClient(int id) {
       Collection<Commande> Commandes= new ArrayList<Commande>();
       Connection conn=BdConnection.getConnection();
       
       try {
		PreparedStatement ps= conn.prepareStatement("select * from COMMANDE "
				+ "where ID_CLIENT=?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Commande cmd = new Commande();
			
			ModelClient model= new ModelClient();			
			cmd.setIdCommande(rs.getInt("ID_COMMANDE"));
			cmd.setClient(model.getClientsParId(rs.getInt("ID_CLIENT")));
			cmd.setDateCmd(rs.getDate("DATE"));
			Commandes.add(cmd);								
		}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

		return Commandes;
	}
	
	public Commande getCommandesParIdCommande(int id) {
	       
	       Connection conn=BdConnection.getConnection();
	       Commande cmd = new Commande();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from COMMANDE "
					+ "where ID_COMMANDE=?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				
				ModelClient model= new ModelClient();			
				cmd.setIdCommande(rs.getInt("ID_COMMANDE"));
				cmd.setClient(model.getClientsParId(rs.getInt("ID_CLIENT")));
				cmd.setDateCmd(rs.getDate("DATE"));
											
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return cmd;
		}
	
	
	
	public List<Commande> findAll() {
	       List<Commande> Commandes= new ArrayList<Commande>();
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from COMMANDE ");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Commande cmd = new Commande();
				
				ModelClient model= new ModelClient();			
				cmd.setIdCommande(rs.getInt("ID_COMMANDE"));
				cmd.setClient(model.getClientsParId(rs.getInt("ID_CLIENT")));
				cmd.setDateCmd(rs.getDate("DATE"));
				Commandes.add(cmd);							
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return Commandes;
		}
	
	

	/*@Override*/
	public void addCommande(Commande cmd) {
		  Connection conn=BdConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO COMMANDE(ID_CLIENT,DATE)"
					+ " VALUES(?,?)");
			ps.setInt(1, cmd.getClient().getIdClient());
			ps.setDate(2, cmd.getDateCmd());
		
			
			
			  ps.executeUpdate();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public void deleteCommande(int id) {
	     
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("DELETE from Commande WHERE ID_Commande=? ");
			ps.setInt(1, id);
			ps.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			
		}
	
	public void deleteCommande(Commande cmd) {
	     
		deleteCommande(cmd.getIdCommande());
			
		}
	
	

}

