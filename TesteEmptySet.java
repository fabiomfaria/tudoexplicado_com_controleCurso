package com.tudoexplicado;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // gera erro pois é um conjunto vazio, não pode adicionar "Paulo".
        // Caso você precisar representar um curso que foi cancelado
		// pois não teve matriculas. Usamos Collections.emptySet() 
		// para gerar um conjunto vazio.

	}

}
