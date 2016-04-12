package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	 private static final String URL = 
				"jdbc:derby:myDerby;create=true;user=derby;password=derby";
				
		    private static final String DRIVER =
				"org.apache.derby.jdbc.EmbeddedDriver";

		    public static Connection getConnection() {
		        try {
		            Class.forName(DRIVER);
		            return DriverManager.getConnection(URL);
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } catch (SQLException e) {
		            throw new RuntimeException(e);
		        }
		        return null;
		    }
}
