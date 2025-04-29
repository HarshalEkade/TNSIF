package Patterns;

import java.util.Scanner;

class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            int ascii = 65 + i - 1; 
            for (int j = rows; j >= i; j--) {
                if ((j - i) % 2 == 0) {
                    System.out.print((char) ascii + " ");
                } else {
                    System.out.print(ascii + " "); 
                     
                }
                ascii++;
            }
            System.out.println();
        }
    }
}

