package ArraysPractise;

import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();


        int [] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(max(arr,num));
    }

    static int max(int [] arr, int num)
    {

        int max = arr[0];
        for (int i = 1; i<num;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }

        }
        return max;
    }
}
