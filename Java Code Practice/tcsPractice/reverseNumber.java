package tcsPractice;

import java.util.*;
class ReverseNum{
    static int reverseCheck(int num){
        String temp="";
        while(num>0){
            int digit=num%10;
            temp+=digit;
            num/=10;
        }
        String num1="";
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)!=0){
                num1+=temp.charAt(i);
            }
        }
        return Integer.parseInt(num1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("The original number is :"+num);
        int rev=reverseCheck(num);
        System.out.println("The reverse number is :"+rev);
        sc.close();
    }
}