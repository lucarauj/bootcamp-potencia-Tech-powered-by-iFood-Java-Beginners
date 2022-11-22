package dominando.algoritmos.intermediarios;

import java.util.Scanner;

public class ChecagemDePalindromo {
	
	/*
	 * Neste desafio voc� dever� construir uma fun��o que recebe uma String e identifique se a mesma � um pal�ndromo, ou seja, 
	 * se a String � igual a ela mesma invertida. 
	 * Dado que temos a String "digital" uma vez invertida temos "latigid" que s�o diferentes.
	 * Logo, N�O � um Pal�ndromo.
	 * J� se recebemos a string "radar" uma vez invertida temos "radar" que s�o iguais.
	 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        
        String novaPalavra = "";
        boolean igualdade = false;
        
        for(int i = palavra.length()-1; i >= 0; i--) {
        	novaPalavra += palavra.charAt(i);
        	igualdade = palavra.equalsIgnoreCase(novaPalavra);
        }
        
    	  if (igualdade) {
    		  System.out.println("TRUE");
    	  } else {
    		  System.out.println("FALSE");
    	  }
        
        sc.close();
    }
}