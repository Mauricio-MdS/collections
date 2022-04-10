package br.com.alura.collections.testes;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return String.format("[Nome: %s, Matrícula: %s]", this.nome, this.numeroMatricula);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(numeroMatricula);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Aluno other = (Aluno) obj;
//		return numeroMatricula == other.numeroMatricula;
//	}

	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
