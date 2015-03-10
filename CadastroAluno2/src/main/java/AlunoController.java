import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlunoController")
public class AlunoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nome   = req.getParameter("nome" );
		String rg     = req.getParameter("rg"   );
		String cpf    = req.getParameter("cpf"  );
		String sexo   = req.getParameter("sexo" );
		String estado = req.getParameter("estado" );
		
		Aluno aluno = new Aluno();
		aluno.setAluno(nome, rg, cpf, estado, sexo);
		
		GerenciadorAluno ga = new GerenciadorAluno();
		ga.salvar(aluno);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		GerenciadorAluno ga = new GerenciadorAluno();
		List<Aluno> alunos = ga.getAluno();
		
		req.setAttribute("aluno", alunos);
		
		RequestDispatcher view = req.getRequestDispatcher("viewAluno.jsp");
		view.forward(req, resp);
		
	}

}
