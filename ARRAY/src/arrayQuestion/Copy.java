package arrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CopyAndReverse {
    public  static void main(String[] args) {
        // Deep copy
        int []arr={1,3,8,9,12,11};
        int [] temp = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        System.out.println("Deep copy :"+Arrays.toString(temp));

        // shallow copy

        int [] arr2 =  {1,3,8,9,12,11};
        int [] temp2 = arr2;

        temp2[0] =101;
        System.out.println("shallow copy :"+Arrays.toString(arr2));
    }
}
