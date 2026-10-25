package hoga;

import java.util.Scanner;

public class ternaryOperator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;
        max = a>b ?a : b;

        // condition ? this  if condition is true : else this

        System.out.println(max);
        // nested ternary Operator

        String nes =18>9 ? (10==10 ? "hello":"hi"):"shit";

        System.out.println(nes);


    }

}
