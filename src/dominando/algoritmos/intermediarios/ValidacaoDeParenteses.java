package dominando.algoritmos.intermediarios;

import java.util.Scanner;

public class ValidacaoDeParenteses {

	/*
	 * Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string � v�lida.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean caracter = ehValido(scanner.nextLine());

		System.out.println(caracter);

		scanner.close();
	}

	public static boolean ehValido(String s) {
		if (s.equals("()") || s.equals("[]")) {
			return true;
		} else {
			return false;
		}
	}

}
