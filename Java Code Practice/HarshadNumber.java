/*
 * A Harshad number, also known as a Niven number, is a positive integer that is 
 * divisible by the sum of its digits. 
 * For example, 12 is a Harshad number because 1 + 2 = 3, and 12 is divisible by 3. 
 */
import java.util.*;
class HarshadNumber{
    static int harshadCheck(int num){
        int sum=0;
        int temp=num;
        while (temp>0) {
            int digit=temp%10;
            sum=sum+digit;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Harshad number or not:");
        int num=sc.nextInt();
        int sum=harshadCheck(num);
        if(num%sum==0){
            System.out.println("It is harshad number.");
        }else{
            System.out.println("It is not harshad number.");
        }
        sc.close();
    }
}