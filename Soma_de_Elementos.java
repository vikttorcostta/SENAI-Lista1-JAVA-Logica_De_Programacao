package Exerc_Java;

import java.lang.reflect.Array;

/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */

public class Soma_de_Elementos {
	
	public static void main(String[] args) {
		
		int vetor[] = {22, 11, 4, 6, 5, 7, 5};
		int resultado = 0;
		
		for(int indice = 0; indice < vetor.length; indice++) {
			resultado += vetor[indice];
		}
		System.out.printf("Soma total dos valores de cada índice: %d", resultado);

	}

}
