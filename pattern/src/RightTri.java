import java.util.Scanner;

public class RightTri {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            m++;
            System.out.println();
        }
    }

}