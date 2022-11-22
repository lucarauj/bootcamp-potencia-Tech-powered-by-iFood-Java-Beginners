package dominando.algoritmos.basicos;

import java.util.Scanner;

public class OsNumerosSaoIguais {

	/*
	 * Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam,
	 * retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as
	 * aspas.
	 */

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numero1 = leitor.nextInt();
		int numero2 = leitor.nextInt();

		if (numero1 == numero2) {
			System.out.println("Sao iguais!");
		} else {
			System.out.println("Nao sao iguais!");
		}

		leitor.close();

	}
}