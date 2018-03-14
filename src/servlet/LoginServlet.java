package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import db.DB;
import model.User;
 
//����login.jsp�ϵ���Ϣ��
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public LoginServlet() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	//�����ַ�����
		response.setCharacterEncoding("utf-8");
		User user = DB.selectUser(request.getParameter("username"), request.getParameter("password"));
		if (user != null){
			HttpSession session = request.getSession(); //�����Ự��
			session.setAttribute("user", user);
			response.sendRedirect("main.jsp");	//��ת��main.jspҳ�棻
		}
		else
			response.sendRedirect("error.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
