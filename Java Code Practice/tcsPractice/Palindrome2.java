package tcsPractice;

import java.util.*;
class Palindrome2{
    static int palindromSumCheck(int num){
        int sum=0;
        int temp=num;
        while (temp>0) {
            int digit=temp%10;
            sum=sum+digit;
            temp/=10;
        }
        String rev="";
        int temp2=sum;
        while(temp2>0){
            int digit=temp2%10;
            rev+=digit;
            temp2/=10;
        }
        int reverse=Integer.parseInt(rev);
        if(sum==reverse){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int rev=palindromSumCheck(num);
        System.out.println(rev);
        sc.close();
    }
}
