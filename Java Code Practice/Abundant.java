/*
 * An abundant number is a positive integer where the sum of its proper divisors
 *  (divisors excluding the number itself) is greater than the number itself.
 *  For example, 12 is abundant because 1 + 2 + 3 + 4 + 6 = 16, which is greater than 12. 
 */

 import java.util.*;
 class AbundantNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Abundent or not :");
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum>num){
            System.out.println(num+" is a Abundent number.");
        }else{
            System.out.println(num+" is not an Abundent Number.");
        }
        sc.close();
    }
 }