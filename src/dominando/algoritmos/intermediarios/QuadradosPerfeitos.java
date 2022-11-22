package dominando.algoritmos.intermediarios;

import java.util.Scanner;

public class QuadradosPerfeitos {
	
	/*
	 * Dado um inteiro n, retorne o menor n�mero de n�meros quadrados perfeitos cuja soma seja n. 
	 * Um quadrado perfeito � um inteiro que � o quadrado de um inteiro; 
	 * em outras palavras, � o produto de algum inteiro consigo mesmo. 
	 * Por exemplo, 1, 4, 9 e 16 s�o quadrados perfeitos, enquanto 3 e 11 n�o s�o.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int n = Integer.parseInt(sc.nextLine());
        int res, count, countTotal;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        countTotal = 1000;
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                res = n;
                count = 0;

                for (int j = i; j > 0; j--) {

                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }                
                if (countTotal > count) {
                    countTotal = count;
                }
            }            
        }
        System.out.println(countTotal);
        
        sc.close();
    }
}