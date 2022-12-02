import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String passwd = "amarisara";
	    private Connection conn;

	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","amarisara");
		}

	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
