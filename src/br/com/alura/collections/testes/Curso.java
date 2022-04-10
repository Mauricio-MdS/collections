package br.com.alura.collections.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Curso {

	private List<Aula> aulas = new ArrayList<Aula>();
	private String nome;
	private String instrutor;
	private Collection<Aluno> alunos = new HashSet<>();
	private Map<Integer , Aluno> matriculaParaAluno = new HashMap<>();

	Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();

		}
		return tempoTotal;
	}

	@Override
	public String toString() {

		return String.format("[Curso: %s , tempo total: %s, aulas: %s ]%n", this.nome, this.getTempoTotal(),
				this.aulas);
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Collection<Aluno> getAlunos() {
		return Collections.unmodifiableCollection(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);
	}

}
