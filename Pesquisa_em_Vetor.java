package Exerc_Java;
import java.util.Scanner;

/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */

public class Pesquisa_em_Vetor {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int vetor [] = {22, 11, 4, 6, 5, 7, 5,};
		int numero;
	
		System.out.println("digite um numero para pesquisa");
		numero = leitura.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice++) {
			if(vetor[indice] == numero) {
				 System.out.println("numero encontrado");
			}else{
				 System.out.println("---x----x----x----x---");
			}
		}
	}

}
