package Patterns;

import java.util.*;
class P5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            char ch='A';
            for(int j=1;j<=rows;j++){
                System.out.print(j+""+(ch++)+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}