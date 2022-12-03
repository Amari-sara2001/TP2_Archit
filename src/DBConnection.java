import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "tparchi";
		String url = "jdbc:postgresql://localhost:5432/postgres" +BDD;
		String user = "postgres";
		String passwd = "amarisara";
	    private Connection conn;

	    private static DBConnection instance;
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","amarisara");
		}

	    
	    public Connection getConn() {
			return conn;
		}
	    public static DBConnection getInstance() throws SQLException {
	    	if(instance == null) {
	    		instance = new DBConnection();
	    	}
	    	return instance;
	    }


		
	
}
