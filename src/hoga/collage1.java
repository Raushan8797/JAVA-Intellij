package hoga;

import java.util.Scanner;

public class collage1 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String lastName = sc.next();
        String pin = sc.next();
        int n = sc.nextInt();

        String small, large;

        if (firstName.length() < lastName.length()) {
            small = firstName;
            large = lastName;
        } else if (firstName.length() > lastName.length()) {
            small = lastName;
            large = firstName;
        } else {
            small = firstName;
            large = lastName;
        }

        String username = small.substring(0, 1).toLowerCase()
                + large.toUpperCase()
                + pin.charAt(n - 1)
                + pin.charAt(pin.length() - n);

        System.out.println(username);
    }
}