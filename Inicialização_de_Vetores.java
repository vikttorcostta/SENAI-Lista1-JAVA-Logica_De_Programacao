package Exerc_Java;
import java.util.Scanner;

/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */


public class Inicialização_de_Vetores {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int numero = 5;
		int vetor[] = new int[numero];
		int indice;
		
		for(indice=0;indice<numero;indice++) {
			System.out.printf("Informe um número->");
			vetor[indice] = leitura.nextInt();
		}
		for(indice=0;indice<numero;indice++) {
			System.out.printf("->%d\n",vetor[indice]);
		}
	}
}
