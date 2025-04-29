package tcsPractice;

import java.util.*;
class NaturalNumberSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int sum=0;
        sum = (num*(num+1))/2;
        System.out.println("The sum of "+num+" is "+sum);
        sc.close();
    }
}