package com.tudoexplicado;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // gera erro pois � um conjunto vazio, n�o pode adicionar "Paulo".
        // Caso voc� precisar representar um curso que foi cancelado
		// pois n�o teve matriculas. Usamos Collections.emptySet() 
		// para gerar um conjunto vazio.

	}

}
