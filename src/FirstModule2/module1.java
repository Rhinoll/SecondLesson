package FirstModule2;

import java.util.Scanner;

public class module1 {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        int s = 0;
        int n = 10;
        while (n >= 10 & n < 100) {
            n = scan.nextInt();

            continue;
        }
        System.out.println(s);
    }
}
