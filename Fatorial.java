package Parte_2_Lista;
import java.util.Scanner;

/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SITEMAS
 * @author PAULO VICTOR COSTA DE MELO
 * TURMA: B88407
 * */

public class Fatorial {
	
	  public static void main(String[] args){
	        int fatorial;
	        System.out.println("Informe um numero: ");
	        Scanner leitura = new Scanner(System.in);
	        fatorial = leitura.nextInt();
	        
	        for(int indice = 1; indice<11; indice++){
	            fatorial *= indice;
	            System.out.println(fatorial);
	        }
	    }

}
