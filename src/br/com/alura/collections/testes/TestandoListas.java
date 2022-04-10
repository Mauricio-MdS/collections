package br.com.alura.collections.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add("Java");
		cursos.add("Python");
		cursos.add("Android");
		
//		cursos.remove(1);
		
		System.out.println(cursos);
		
		System.out.println("O primeiro curso da lista é: " + cursos.get(0));
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Curso: " + cursos.get(i));
		}
		
		System.out.println("Ordenando a lista");
		Collections.sort(cursos);
		System.out.println(cursos);

	}

}
