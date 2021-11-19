package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/Controla")
public class Controla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Controla() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("enviar")!=null) {
		int ladoA,ladoB,ladoC;
		String tipo="";
		ladoA= Integer.parseInt(request.getParameter("ladoA"));
		ladoB= Integer.parseInt(request.getParameter("ladoB"));
		ladoC= Integer.parseInt(request.getParameter("ladoC"));
		
		if(ladoA==ladoB && ladoB==ladoC) {
			tipo="Triangulo Equilatero";
		}else if(ladoA==ladoB || ladoA==ladoC || ladoB==ladoC) {
			tipo="Triangulo Isoceles";
		}else tipo="Triangulo escaleno";
		
		JOptionPane.showMessageDialog(null, "La suma de los lados: "+tipo);
		response.sendRedirect("index.jsp?t="+tipo);
		}
	}

}
