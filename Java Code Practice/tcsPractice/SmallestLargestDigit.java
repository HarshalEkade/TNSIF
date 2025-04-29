package tcsPractice;

import java.util.*;
class SmallestLargestDigit{
    static int Smallcheck(int num){
        int temp1=num;
        int small=Integer.MAX_VALUE;
        while(temp1>0){
            int digit=temp1%10;
            if(small>digit){
                small=digit;
            }
            temp1/=10;
        }
        return small;
    }
    static int Largecheck(int num){
        int temp1=num;
        int large=Integer.MIN_VALUE;
        while(temp1>0){
            int digit=temp1%10;
            if(large<digit){
                large=digit;
            }
            temp1/=10;
        }
        return large;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int small=Smallcheck(num);
        int large=Largecheck(num);
        System.out.println("The smallest digit is: "+small);
        System.out.println("The largest digit is: "+large);
        sc.close();

    }
}
