
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connexion {

	final String driver = "com.mysql.jdbc.Driver";
	final String url = "jdbc:mysql://localhost/hopital?autoReconnect=true&useSSL=false";
	final String user = "root";
	final String password ="";
	
	//String req = "select * from medecins order by nom";
	ResultSet res=null;
	int i;
	public ResultSet envoiRequete(String req) {
		try{
			Class.forName(driver).newInstance();
			Connection con = DriverManager.getConnection(url, user , password);
			Statement st = con.createStatement();
			if(req.substring(0, 6).equalsIgnoreCase("select")){
				res = st.executeQuery(req);
			}else {i =  st.executeUpdate(req);
			System.out.println(i);}
			return res;
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found " + driver);
			return res;
		}
		catch(SQLException e){
			System.out.println("SQL error : " + e.getMessage());
			return res;
		}
		catch(Exception e){
			System.out.println("classe non trouv�e " + driver);
			return res;
		}
	}
	
	public void affiche(ResultSet res)
	{
		if(res != null){	try{
			while(res.next())
			{
				System.out.println(res.getString("nom")+ " "+res.getInt(1));
			}
		}catch(Exception e){
			
		}
	}else System.out.println("modif");
	}

}
