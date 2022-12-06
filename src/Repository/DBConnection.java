package Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
	    private static DBConnection instance;
		String BDD = "dbconnection";
		String url = "http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=dbconnection" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;

	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    public static DBConnection getInstance()throws SQLException {
	    	if (instance == null) instance = new DBConnection ();
	    	else if (instance.getConn().isClosed()) instance = new DBConnection();
	    	return instance;
	    }
	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
