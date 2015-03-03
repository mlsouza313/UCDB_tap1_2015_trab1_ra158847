package br.ucdb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucdb.util.Cliente;

@WebServlet (urlPatterns="/ClienteServlet")
public class ClienteServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id   = req.getParameter("id"   );
		String nome = req.getParameter("nome" );
		String rg   = req.getParameter("rg"   );
		String cpf  = req.getParameter("cpf"  );
		String sexo = req.getParameter("sexo" );
		
		int codigocliente = Integer.parseInt(id);
		
		Cliente cliente = new Cliente();
		cliente.cadastrar(codigocliente, nome, rg, cpf, sexo);
		
		req.setAttribute("nome", cliente.getNome() );
		req.setAttribute("id",   cliente.getId()   );
		req.setAttribute("rg",   cliente.getRg()   );
		req.setAttribute("cpf",  cliente.getCpf()  );
		req.setAttribute("sexo", cliente.getSexo() );
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("clienteview.jsp");
		dispatcher.forward(req, resp);
		
	}

}
