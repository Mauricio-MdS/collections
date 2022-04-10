package br.com.alura.collections.testes;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();
//    	Collection<Integer> numeros = new HashSet<>();

        long inicioDaAdicao = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        
        long fimDaAdicao = System.currentTimeMillis();
        
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimDaBusca = System.currentTimeMillis();

        long tempoDeExecucaoAdicao = fimDaAdicao - inicioDaAdicao;
        long tempoDeExecucaoBusca =  fimDaBusca - fimDaAdicao;

        System.out.println("Tempo gasto na adição: " + tempoDeExecucaoAdicao);
        System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBusca);

    }

}