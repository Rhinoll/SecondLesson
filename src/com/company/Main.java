package com.company;

import java.util.Scanner;

public class Main {

    public static void reverser(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int temp = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void transposer(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotate90(int[][] matrix) {
        transposer(matrix);
        reverser(matrix);
    }

    public static void print(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] matrix = new int[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(b + " " + a);
        rotate90(matrix);
        print(matrix);
    }
}



