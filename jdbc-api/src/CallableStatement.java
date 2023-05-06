import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatement {
	
	public static void main(String[] args) throws Exception {
		String sql="select a,b from person";
		try {
				Connection conn= JdbcFactory.getConnection();
				Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);;
				ResultSet rs=stmt.executeQuery(sql);
				
				rs.absolute(5);
				rs.updateString("NAME", "AINSWORTH");
				
				rs.updateRow();
			
				while(rs.next())
					System.out.println(rs.getString(1)+"\t "+rs.getInt("age")+"\t "+rs.getString(3));
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}