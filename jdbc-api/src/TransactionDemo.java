import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql="insert into person values('Ben',21,'bangaluru')";
		String sql2="insert into person values('Nep',20,'Jaipur')";
		String sql3="insert into person values('prrr',25,'Mumbai')";
		
		Connection conn=null;
		try {
			conn=JdbcFactory.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			stmt.addBatch(sql);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			
			conn.commit();
			System.out.println("execute successful..");
			
		}catch(SQLException e) {
			System.out.println("Failed..");
			e.printStackTrace();
			try {
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
				
				
			}
			
		}
	
	}

}
