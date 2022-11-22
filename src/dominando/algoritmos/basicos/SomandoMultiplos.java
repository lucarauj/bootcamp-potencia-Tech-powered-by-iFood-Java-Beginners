package dominando.algoritmos.basicos;

import java.util.Scanner;

public class SomandoMultiplos {

	/*
	 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A
	 * até o seu limite N.
	 */

	public static void main(String[] args) {

		int A, N;
		int contador = 0;

		Scanner input = new Scanner(System.in);
		A = input.nextInt();
		N = input.nextInt();

		for (int i = N; i >= A; i--) {
			if (i % A == 0) {
				contador += i;
			}
		}
		System.out.println(contador);

		input.close();

	}
}
