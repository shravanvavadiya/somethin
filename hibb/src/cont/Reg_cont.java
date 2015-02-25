package cont;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbo.Reg_dbo;

import vao.Reg_vao;

/**
 * Servlet implementation class Reg_cont
 */
@WebServlet("/Reg_cont")
public class Reg_cont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg_cont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		
		Reg_vao rv=new Reg_vao();
		
		rv.setFn(fn);
		rv.setLn(ln);
		
		Reg_dbo rd=new Reg_dbo();
		
		rd.insert(rv);
		
		response.sendRedirect("welcome.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
