package br.ucdb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucdb.util.Calculadora;

@WebServlet (urlPatterns="/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		Calculadora calc = new Calculadora();
		int result = calc.somar(num1, num2);
		
		PrintWriter pw = resp.getWriter(); // objeto para escrever conteudo no html
		pw.print("A soma é: " +result);
		
		
	}

	
}
