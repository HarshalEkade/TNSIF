/*
 * A Happy Number is a number that eventually reaches 1 when replaced by the sum of
 *  the squares of its digits repeatedly.
 *  If it falls into a cycle that does not include 1, then it is not a happy number.
 */
import java.util.*;
class HappyNumber{
   static int squareOfNumber(int num){
        int temp=num;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+(digit*digit);
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is happy number or not:");
        int num=sc.nextInt();
        while(num!=1 && num!=4){
          num= squareOfNumber(num);
        }

        if(num==1){
            System.out.println("It is a Happy number.");
        }else{
            System.out.println("It is not Happy number.");
        }
        sc.close();
    }
}
