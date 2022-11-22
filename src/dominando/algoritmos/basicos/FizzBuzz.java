package dominando.algoritmos.basicos;

import java.util.Scanner;

public class FizzBuzz {

	/*
	 * Neste desafio, você terá que criar uma função que faça um número como
	 * argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
	 * 
	 * Você receberá um número onde: Se o número for um múltiplo de 3 e 5
	 * ->"FizzBuzz"; Se o número for apenas múltiplo de 3 -> "Fizz" ; Se o número
	 * for apenas múltiplo de 5 -> "Buzz"; Se o número não for um múltiplo de 3 ou
	 * 5, o número deve ser exibido;
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