package dominando.algoritmos.basicos;

import java.util.Scanner;

public class FizzBuzz {

	/*
	 * Neste desafio, voc� ter� que criar uma fun��o que fa�a um n�mero como
	 * argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
	 * 
	 * Voc� receber� um n�mero onde: Se o n�mero for um m�ltiplo de 3 e 5
	 * ->"FizzBuzz"; Se o n�mero for apenas m�ltiplo de 3 -> "Fizz" ; Se o n�mero
	 * for apenas m�ltiplo de 5 -> "Buzz"; Se o n�mero n�o for um m�ltiplo de 3 ou
	 * 5, o n�mero deve ser exibido;
	 */

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		int N = number.nextInt();

		if (15 % N == 0) {
			if (N % 5 == 0 && N % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (N % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println("Fizz");
			}

		} else {
			System.out.println(N);
		}

		number.close();

	}
}