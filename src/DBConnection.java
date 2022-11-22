import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
	    private static DBConnection instance;
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;

	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    public static DBConnection getInstance() {
	    	return instance;
	    }
	    
	    public Connection getConn() {
			return conn;
		}


		
	
}