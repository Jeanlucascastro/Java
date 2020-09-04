package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas ");
		int l = sc.nextInt();
		System.out.println("Digite o numero de colunas ");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int numero = 0;
		System.out.println("Digite a o numero que voce quer ?");
		numero = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numero) {
					System.out.println(i + "," + j);
					if (j > 0) {
						System.out.println("Left" + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up" + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Rigth" + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down " + mat[i + 1][j]);

					}
				}
			}

		}

		sc.close();
	}
}
