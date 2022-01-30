import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCRUD {
	 public int insert(StudentBean sb) throws ClassNotFoundException, SQLException {
	   	 String sql="insert into student values(?,?)";
	   	 Connection con=DbConnection.dbConn();
	   	 PreparedStatement ps=con.prepareStatement(sql);
	   	 ps.setInt(1,sb.getSid() );
	   	 ps.setString(2,sb.getSname());
	   	 return ps.executeUpdate();
	   	 
	    }
}
