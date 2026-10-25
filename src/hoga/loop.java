package hoga;

import java.util.Scanner;

public class loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();

        int even = 0;
        int odd= 0;
        for (int i = l; i<=u; i++)
            if(i%2==0){
                even +=i ;
            }else{
                odd +=i;
            }
        System.out.println(even);
        System.out.println(odd);
    }

}
