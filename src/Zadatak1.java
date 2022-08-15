import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
//Написати функцију која прима матрицу (2Д низ) и враћа највећи ред (по збиру)
//Hint: Сетите се како смо радили највећи елемент низа
//int[][] matrix = { { 3, 2, 1, 7 },
//{ 9, 11, 5, 4 },
//{ 6, 0, 13, 17 },
//{ 7, 21, 14, 15 } };
//largestRow(matrix); // Враћа - [7, 21, 14, 15]

    public static int[] largestRow(int[][] matrica) {

            int maxRed = 0;
            int indexmaxreda = 0;
            for (int i = 0; i < matrica[0].length; i++) {
                maxRed += matrica[0][i];
            }
            for (int i = 1; i < matrica.length; i++) {
                int sumaReda = 0;
                for (int j = 0; j < matrica[i].length; j++) {
                    sumaReda += matrica[i][j];
                    if (sumaReda > maxRed) {
                        maxRed = sumaReda;
                        indexmaxreda = i;
                    }
                }
            } return matrica[indexmaxreda];
        }


        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite broj redova: ");
            int N = sc.nextInt();
            System.out.print("Unesite broj kolona: ");
            int M = sc.nextInt();
            int[][] matrica = new int[N][M];
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++) {
                    matrica[i][j] = sc.nextInt();
                    System.out.print(matrica[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Najveci red je: " + Arrays.toString(largestRow(matrica)));
        }
    }

