/*A Strong number is a number whose sum of the factorial of its digits is equal to the number itself.
For example, 145 is a Strong number because:
145
1!+4!+5!=1+24+120=145 */

import java.util.*;
class StrongNumber{
    static int factorial(int num){
        int fact=1;
        
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is strong number or not :");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+factorial(digit);
            temp/=10;
        }
        if(num==sum){
            System.out.println(num+" is a strong number");
        }else{
            System.out.println(num+" is not a strong number");
        }
        sc.close();
    }
}
