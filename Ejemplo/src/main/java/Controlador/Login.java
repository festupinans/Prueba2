package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario, password;
		if(request.getParameter("enviar")!=null){
			usuario=request.getParameter("usuario");
			password=request.getParameter("password");
			
			if(usuario.equals("admininicial") && password.equals("admin123456")) {
				JOptionPane.showMessageDialog(null, "Bienvenido!!! Administrador");
				response.sendRedirect("Menu.jsp?nom="+usuario);
			
			}else {
				JOptionPane.showMessageDialog(null, "Datos incorrectos");
				response.sendRedirect("Login.jsp");
			}
		}
	}

}
