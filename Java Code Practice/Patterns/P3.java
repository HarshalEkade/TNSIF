package Patterns;

import java.util.*;
class P3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(i+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
