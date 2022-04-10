package br.com.alura.collections.testes;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
// atribui valores
		Recibo rec2 = new Recibo();
// atribui valores
		Recibo rec3 = new Recibo();
// atribui valores
		
		Set<Recibo> recibos = new TreeSet<>(new Comparator<Recibo>(){
			{
		}

			@Override
			public int compare(Recibo o1, Recibo o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);

	}

}
