package tcsPractice;

import java.util.Scanner;

class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K value:");
        int k = sc.nextInt();

        while (k > 0) {
            int last = arr[size - 1];  

            
            for (int i = size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last; 
            k--;  
        }

        System.out.println("The Final Output:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
