import java.util.Scanner;

public class condition  {
   public static void main() {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       if (a%2==0){
           System.out.println("a is even");
       }
       else {
           System.out.println("a is odd");
       }
    }
}