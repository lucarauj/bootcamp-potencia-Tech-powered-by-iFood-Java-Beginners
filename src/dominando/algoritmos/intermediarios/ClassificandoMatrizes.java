package dominando.algoritmos.intermediarios;

import java.util.Scanner;

public class ClassificandoMatrizes {
	
	/*
	 * Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
	 * Retorne um array que satisfaça essa condição.
	 */

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i, aux;
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		for (i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		for (i = 0; i < nums.length; i++) {
				for (int j = (i+1); j < nums.length; j++) {
					if (nums[j] % 2 == 0) {
						aux = nums[i];
						nums[i] = nums[j];
						nums[j] = aux;
						j = nums.length;
					}
				}
			}

		for (var entry : nums) {
			System.out.println(entry);
		}

		sc.close();

	}
}