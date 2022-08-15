import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
    //Написати програм који највећу (по збиру) колону, ставља на прво место
//int[][] matrix = { { 3, 2, 1, 7 },
//{ 9, 11, 5, 4 },
//{ 6, 0, 13, 17 },
//{ 7, 21, 14, 15 } };
//// ... Овде иде ваша магија
//int[][] result = { { 7, 3, 2, 1 },
//{ 4, 9, 11, 5 },
//{ 17, 6, 0, 13 },
//{ 15, 7, 21, 14 } };
    public static void main(String[] args) {
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
        /////////////////////////////////////////////////////////////////
        int maxKolona = 0;
        int indexmaxkolone = 0;
        for (int i = 0; i < matrica[0].length; i++) {
            maxKolona += matrica[i][0];
        }
        int sumaKolone = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 1; j < matrica[i].length; j++) {
                sumaKolone += matrica[i][j];
                if (sumaKolone > maxKolona) {
                    maxKolona = sumaKolone;
                    indexmaxkolone = j;
                }
            }
        }
        System.out.println(indexmaxkolone);

        for (int i = 0; i < matrica.length; i++){
            int temp = matrica[i][0];
            matrica[i][0] = matrica[i][indexmaxkolone];
            matrica[i][indexmaxkolone] = temp;

        }
        System.out.println("____________________________________________");
        for (int i = 0; i < matrica.length;i++){
            for (int j = 0; j < matrica[i].length; j++){
                System.out.print(matrica[i][j] + " ");
            }System.out.println();
        }
    }
}
