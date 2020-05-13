package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import METIER.Client;

public class ModelClient {
	
	
	public Client getClientsParId(int id) {
	     
	       Connection conn=BdConnection.getConnection();
	       Client c = new Client();
	      
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from CLIENT "
					+ "where ID_CLIENT=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				c.setIdClient(rs.getInt("ID_CLIENT"));
				c.setNom(rs.getString("NOM"));
				c.setPrenom(rs.getString("PRENOM"));
				c.setRaisonSociale(rs.getString("RAISON_SOCIALE"));
				c.setAdresse(rs.getString("ADRESSE"));
				c.setCodePostal(rs.getString("CODE_POSTAL"));
				c.setVille(rs.getString("VILLE"));
				c.setTel(rs.getString("TEL"));
				
											
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return c;
		}
	
	public Collection<Client> getClientsParMotCle(String mc) {
       Collection<Client> clients= new ArrayList<Client>();
       Connection conn=BdConnection.getConnection();
       mc=mc.toUpperCase();
       try {
		PreparedStatement ps= conn.prepareStatement("select * from CLIENT "
				+ "where UPPER(NOM) LIKE ?");
		ps.setString(1, "%"+mc+"%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Client c = new Client();
			c.setIdClient(rs.getInt("ID_CLIENT"));
			c.setNom(rs.getString("NOM"));
			c.setPrenom(rs.getString("PRENOM"));
			c.setRaisonSociale(rs.getString("RAISON_SOCIALE"));
			c.setAdresse(rs.getString("ADRESSE"));
			c.setCodePostal(rs.getString("CODE_POSTAL"));
			c.setVille(rs.getString("VILLE"));
			c.setTel(rs.getString("TEL"));
			clients.add(c);								
		}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

		return clients;
	}
	
	public List<Client> findAll() {
	       List<Client> clients= new ArrayList<Client>();
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from CLIENT ");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Client c = new Client();
				c.setIdClient(rs.getInt("ID_CLIENT"));
				c.setNom(rs.getString("NOM"));
				c.setPrenom(rs.getString("PRENOM"));
				c.setRaisonSociale(rs.getString("RAISON_SOCIALE"));
				c.setAdresse(rs.getString("ADRESSE"));
				c.setCodePostal(rs.getString("CODE_POSTAL"));
				c.setVille(rs.getString("VILLE"));
				c.setTel(rs.getString("TEL"));
				clients.add(c);								
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return clients;
		}
	
	


	public void addClient(Client c) {
		  Connection conn=BdConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO CLIENT(NOM,PRENOM,RAISON_SOCIALE,ADRESSE,CODE_POSTAL,VILLE,TEL)"
					+ " VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getRaisonSociale());
			ps.setString(4, c.getAdresse());
			ps.setString(5, c.getCodePostal());
			ps.setString(6, c.getVille());
			ps.setString(7, c.getTel());
			
			
			  ps.executeUpdate();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public void deleteClient(int id) {
	     
	       Connection conn=BdConnection.getConnection();
	       
	       try {
			PreparedStatement ps= conn.prepareStatement("DELETE from CLIENT WHERE ID_CLIENT=? ");
			ps.setInt(1, id);
			ps.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			
		}
	
	public void deleteClient(Client c) {
	     
		deleteClient(c.getIdClient());
			
		}
	
	

}
