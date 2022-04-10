package br.com.alura.collections.testes;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso curso = new Curso("Java Collections", "Paulo Silveira");

		System.out.println(curso.getAulas());

		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));

		curso.matricula(new Aluno("Bruno Enrico Cardoso", 671));
		curso.matricula(new Aluno("Sophia Mariana Gabriela Moraes", 423));
		curso.matricula(new Aluno("André Cláudio Castro", 606));
		curso.matricula(new Aluno("Sebastião Pedro Figueiredo", 277));
		curso.matricula(new Aluno("Diogo Geraldo Alves", 664));

		System.out.println(curso);
		System.out.println(curso.getAlunos());

//		Collection<Aluno> alunos = curso.getAlunos();
//		alunos.add(new Aluno("Pedro Henrique Davi da Paz", 552));

		Aluno aluno = new Aluno("André Cláudio Castro", 606);

		System.out.println(curso.estaMatriculado(aluno));

		System.out.println(curso.buscaMatriculado(277));
		System.out.println(curso.buscaMatriculado(0));
	}

}
