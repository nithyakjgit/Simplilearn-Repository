

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentData
 */
public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean sb=new StudentBean();
	   	 sb.setSid(Integer.parseInt(request.getParameter("id")));
	   	 sb.setSname(request.getParameter("sname"));
	   	 StudentCRUD scrud=new StudentCRUD();
	   	 try {
	   		 int rows=scrud.insert(sb);
	   		  PrintWriter pw=response.getWriter();
	   		  
	   		 if(rows>0) {
	   			 pw.print("insertion successful");
  			 pw.print("<html><body><form action='RetrivalStudent' method='post'><input type='submit' value='retrive'>");
	   			 pw.print("</form></body></html>");
	   		 }else {
	   			 pw.print("not sucessful");
	   		 }
	   		 
	   	 } catch (ClassNotFoundException e) {
	   		 // TODO Auto-generated catch block
	   		 e.printStackTrace();
	   	 } catch (SQLException e) {
	   		 // TODO Auto-generated catch block
	   		 e.printStackTrace();
	   	 }
	   	 
	}

}
