package JDBCtemplate.jdbcex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO implements StudentCRUD{
   JdbcTemplate temp;
   
	public JdbcTemplate getTemp() {
	return temp;
}

public void setTemp(JdbcTemplate temp) {
	this.temp = temp;
}

	public int save(StudentBean s) {
		String sql="insert into Student values("+s.getStudentid()+","+"'"+s.getStudentname()+"')";

		
		return temp.update(sql);
	}

	public List<StudentBean> getallstudents() {
		String sql="select * from Student";
		
		 return temp.query(sql,new ResultSetExtractor<List<StudentBean>>() {

	   		 public List<StudentBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
	   			 
	   			 List<StudentBean> list=new ArrayList<StudentBean>();
	   			 
	   			 while(rs.next()) {
	   				 StudentBean sb=new StudentBean();
	   				 sb.setStudentid(rs.getInt(1));//101
	   				 sb.setStudentname(rs.getString(2));//karthik
	   				 list.add(sb);
	   				 
	   			 }
	   			 
	   			 return list;
	   			 
	   			 
	   		 }
	   		 
	   		 
	   		 
	   		 
	   		 
	   	 } );
	   	 
	    }
	    

	}
