import java.util.ArrayList;
import java.util.List;


public class GerenciadorAluno {
	private static List<Aluno> alunos =  new ArrayList<Aluno>(); 
	
	public void salvar(Aluno aluno) {
		alunos.add(aluno);
	}

	public List<Aluno> getAluno() {
		return alunos;
	}

}


