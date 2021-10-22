package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        short check = -1;
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        for (int i = 0; i < n; i++){
            if (array[i]==x){
                System.out.print(i+1 + " ");
                check = 0;
            }
        }
        if (check == -1) {
            System.out.println(check);
        }
    }
}



