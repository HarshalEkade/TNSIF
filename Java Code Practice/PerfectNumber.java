/*A Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
 Example: 6 (1 + 2 + 3 = 6), 28 (1 + 2 + 4 + 7 + 14 = 28). */

import java.util.*;
class PerfectNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to check whether it is perfect number or not :");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("The given number is perfect number");
        }else{
            System.out.println("The given number is not perfect number");
        }
        sc.close();
    }
}
