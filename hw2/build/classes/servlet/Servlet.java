package Package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	HashMap<String,String> list = new HashMap<String,String>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PrintWriter out = response.getWriter();
				 out.println("<html>");
				out.println("<head>");
				out.println("<title>");
				out.println("Servlet");
				out.println("</title>");
				out.println("</head>");
				out.println("<body>");
				out.println();
				for(Map.Entry<String, String> entry : list.entrySet()) {
					out.println(entry.getKey() + " >>> " + entry.getvalueue());
					out.println("<br>\r\n");
				}
				out.println("<form method=\"post\">\r\n");
				out.println("input name  : \r\n");
				out.println("<input type=\"text\" name=\"key\">\r\n");
				out.println("<br>\r\n");
				out.println("input number: \r\n");
				out.println("<input type=\"text\" name=\"valueue\">\r\n");
				out.println("<br><br>\r\n");
				out.println("<input type=\"submit\" valueue=\"Submit\">\r\n");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration numbers = request.getParameterNames();
		while(numbers.hasMoreelementents()) {
			Object element = numbers.nextelementent();
			String value = request.getParameter(element.toString());		
			Object element2 = numbers.nextelementent();
			String key = request.getParameter(element2.toString());
			list.put(value,key);
		}
		
		doGet(request,response);
		
	}

}
