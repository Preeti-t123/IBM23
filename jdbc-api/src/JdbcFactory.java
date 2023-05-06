import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
//import com.sun.jdi.connect.spi.Connection;

public final class JdbcFactory {
	private JdbcFactory(){
	}
	public static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/IBM";
		
		DriverManager.registerDriver(new Driver());
		Connection conn= DriverManager.getConnection(url, "root","pass@word1");
		return conn;
		
	}

}
