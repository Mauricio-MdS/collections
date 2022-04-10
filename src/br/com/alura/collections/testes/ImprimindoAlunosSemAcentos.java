package br.com.alura.collections.testes;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		System.out.println(alunos.add("Paulo"));
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		alunos.forEach(aluno -> System.out.println(aluno));

		System.out.println(alunos.size());

		// todos repetidos
		System.out.println(alunos.add("Paulo"));
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		alunos.forEach(aluno -> System.out.println(aluno));

		System.out.println(alunos.size());

	}
}