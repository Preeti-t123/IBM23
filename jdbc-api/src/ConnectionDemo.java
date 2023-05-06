import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;
//import com.sun.jdi.connect.spi.Connection;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/IBM";
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn=DriverManager.getConnection(url, "root","pass@word1");
			System.out.println("Connected Successfully");
			
			DatabaseMetaData meta=(DatabaseMetaData) conn.getMetaData();
			System.out.println("DB name: "+meta.getDatabaseProductName());
			System.out.println("Db version: "+meta.getDatabaseProductVersion());
			System.out.println("Driver name: "+meta.getDriverName());
			System.out.println("Driver Version: "+meta.getDriverVersion());
		} catch (SQLException e) {
			System.out.println("Failed..");			
			e.printStackTrace();
		}
		
	}
}
