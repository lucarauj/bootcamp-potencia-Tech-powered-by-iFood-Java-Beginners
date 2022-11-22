package dominando.algoritmos.intermediarios;

import java.util.Scanner;

public class FatorialDesajeitado {

	/*
	 * O fatorial de um n�mero inteiro positivo N � o produto de todos os inteiros
	 * positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando os
	 * inteiros em ordem decrescente, trocando as opera��es de multiplica��o por uma
	 * rota��o fixa de opera��es cuja ordem �: multiplicar '*', dividir '/',
	 * adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 -
	 * 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as opera��es
	 * ainda s�o aplicadas usando a ordem usual de opera��es aritm�ticas. Al�m
	 * disso, a divis�o neste caso sempre resulta em um n�mero inteiro, por exemplo,
	 * 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = Integer.parseInt(sc.nextLine());
		int resultado = 0;
		int variavelTemporaria = numero;
		numero--;

		while (numero > 0) {
			variavelTemporaria *= numero;
			numero--;
			if (numero != 0) {
				variavelTemporaria /= numero;
				numero--;
			}
			variavelTemporaria += numero;
			numero--;
			resultado += variavelTemporaria;
			variavelTemporaria = -numero;
			if (numero == 1) {
				resultado += variavelTemporaria;
			}
			numero--;
		}
		System.out.println(resultado);
		sc.close();
	}
}