/*
 * A deficient number, also known as a defective number, is a positive integer
 *  where the sum of its proper divisors (divisors excluding the number itself) is less than the number itself.
 * Example: The number 8 has proper divisors of 1, 2, and 4. 
 * The sum of these proper divisors (1 + 2 + 4 = 7) is less than 8, therefore 8 is a deficient number. 
 * 
 */

 import java.util.*;
 class DeficientNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is deficient or not:");
        int num=sc.nextInt();

        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if (sum<num) {
            System.out.println(num+" is a deficient number.");
        }else{
            System.out.println(num+" is not deficient number.");
        }
        sc.close();
    }
 }