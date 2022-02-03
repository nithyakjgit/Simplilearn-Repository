package JDBCtemplate.jdbcex;

import java.util.List;

public interface StudentCRUD {
public int save(StudentBean s);
public List<StudentBean>getallstudents();
}
