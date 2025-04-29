package Patterns;

import java.util.*;
class P9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        int num=0;
        for(int i=1;i<=rows;i++){
            num+=i;
            for(int j=1;j<=rows;j++){
                System.out.print(num++ +" ");
            }
            num=0;
            System.out.println();
        }
    }
}
