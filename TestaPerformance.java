package com.tudoexplicado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        
        System.out.println("Tempo de Execu??o usando ArrayList");

        System.out.println("Tempo gasto: " + tempoDeExecucao);
        
        System.out.println("___________________________________");
        
        Collection<Integer> numeros2 = new HashSet<>();

        long inicio2 = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros2.add(i);
        }

        for (Integer numero2 : numeros2) {
            numeros2.contains(numero2);
        }

        long fim2 = System.currentTimeMillis();

        long tempoDeExecucao2 = fim2 - inicio2;
                
        System.out.println("Tempo de Execu??o usando HashSet");

        System.out.println("Tempo gasto: " + tempoDeExecucao2);
        
        System.out.println("___________________________________");
	}

}
