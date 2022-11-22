package dominando.algoritmos.basicos;

import java.util.Scanner;

public class BuscaSequencial {

	/*
	 * Uma busca sequencial se caracteriza por percorrermos todos os elementos de uma estrutura em busca do elemento “X” desejado. 
	 * Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. 
	 * Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso. 
	 * Considere um array de 10 elementos do tipo inteiro: Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 
	 * Carregue esses elementos em um array. 
	 * Crie um método que realiza uma busca sequencial. 
	 * Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. 
	 * Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.
	 */

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

		int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

		procuraNumero(elementos, N);

		leitor.close();

	}

	static void procuraNumero(int[] elementos, int numero) {
		for (int i = 0; i < elementos.length - 1; i++) {
			if (elementos[i] == numero) {
				System.out.println("Achei " + elementos[i] + " na posicao " + i);
				return;
			}
		}
		
		System.out.println("Numero " + numero + " nao encontrado!");
	}
}