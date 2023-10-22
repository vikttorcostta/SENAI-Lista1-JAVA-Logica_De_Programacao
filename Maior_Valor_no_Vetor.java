package Exerc_Java;
/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */

public class Maior_Valor_no_Vetor {
	
	public static void main(String[] args) {
		
		int vetor[] = {22, 11, 4, 6, 5, 7, 5,};
		int maior = 0;
		
		for(int indice = 0; indice < vetor.length; indice++) {
			
			if(maior < vetor[indice]) {
				maior = vetor[indice];
			}
		}
		System.out.printf("%d", maior);
		
	}

}
