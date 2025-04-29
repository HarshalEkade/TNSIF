/*
 * An automorphic number is a number whose square ends with the same digits as the number itself. 
 * For example, 5 is an automorphic number because 5^2 = 25, which ends in 5. 
 */
import java.util.*;
class AutomorphicNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is automorphic or not :");
        int num=sc.nextInt();
        sc.close();
        int square=num*num;
        int temp=num;
        while(temp>0){
            if(square % 10 != temp % 10){
                System.out.println(num+" is not automorphic number.");
                return;
            }
            square/=10;
            temp/=10;

        }
        System.out.println(num+" is an automorphic number.");
   

    }
}
