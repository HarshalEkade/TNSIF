package Patterns;

import java.util.*;
class P6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=1;i<=rows;i++){
            char ch=(char)(96+rows);
            for(int j=1;j<=rows;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}