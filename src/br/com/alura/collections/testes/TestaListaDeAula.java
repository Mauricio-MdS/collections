package br.com.alura.collections.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(new Aula("Revistando as ArrayLists", 21));
		aulas.add(new Aula("Listas de objetos", 20));
		aulas.add(new Aula("Relacionamento de listas e objetos", 15));
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado pelo padrão:");
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println("Depois de ordenado pelo tempo:");
		
		System.out.println(aulas);

	}

}
