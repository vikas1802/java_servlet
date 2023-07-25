package p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/marriagepage")
public class E extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public E() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	int a = Integer.parseInt(age);
	PrintWriter obj = response.getWriter();
			if(gender.charAt(0)=='m'||gender.charAt(1)=='M') {
		if(a>25) {
			obj.println("<h1 Style = 'color:red; background-color:blue'>valid for marriage</h1>");
		}
		else{
			obj.println("<h1 Style = 'color:red; background-color:blue'>Not valid for marriage</h1>");
		}
	}
			else {
				if(a>30) {
					obj.println("<h1 Style='color : red; background-color:blue'>Valid for marriage</h1>");
				}
				else {
					obj.println("<h1 Style='color : red; background-color:blue'>Not valid for marriage</h1>");
				}
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
