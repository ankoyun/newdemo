package ls.hdgl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ls.hdgl.HdService;

/**
 * Servlet implementation class Hdbmks
 */
@WebServlet("/Hdbmks")
public class Hdbmks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据
		String id =request.getParameter("hdid");
		//处理数据
		try {
			HdService.updateHdzt(0, Integer.parseInt(id));
			response.sendRedirect("Hdlb");
		}catch(NumberFormatException e) {
			
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
