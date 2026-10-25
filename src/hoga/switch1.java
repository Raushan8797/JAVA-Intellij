package hoga;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch =sc.next().charAt(0);
        switch (ch) {
            case 'a','e','i','o','u':{
                System.out.println("vowel");
                break;}
            default:
                System.out.println();

        }


    }
}
