package Exerc_Java;
/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */

public class Inversão_de_Vetor {
	
	public static void main(String[] args) {
		

		int vetor[] = {22, 11, 4, 6, 5, 7, 5,};
	
		
		for(int indice = 0; indice < vetor.length; indice++) {
			System.out.println(vetor[indice]);
		}
		System.out.println("=================================");
		for(int indice = vetor.length -1; indice >=0; indice--) {
			
			System.out.println(vetor[indice]);
		}
	
	}
}
