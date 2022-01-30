

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.empbean.Empbean;
import com.project.empdao.Empdao;

/**
 * Servlet implementation class Employee
 */
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getServletPath();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void showeditform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException{
		int empno = Integer.parseInt(request.getParameter("empno"));
		 Empbean existingEmployee;
		 existingEmployee=Empdao.selectEmployee(empno);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("employee-form.jsp");
		 request.setAttribute("empno",existingEmployee);
		 dispatcher.forward(request,response);	 

	}
	

}
