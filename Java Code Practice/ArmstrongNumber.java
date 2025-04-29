/*
 * An Armstrong number is a number that is equal to the sum of its own digits,
 *  each raised to the power of the number of digits in the number.
 *  For example, 153 is an Armstrong number because 1³ + 5³ + 3³ = 153. 
 */
import java.util.*;
class Armstrong{
    static int armstrongCheck(int num){
        int sum=0;
        int temp1=num;
        int temp2=num;
        int cnt=0;
        while(temp1>0){
            cnt++;
            temp1/=10;
        }
        while(temp2>0){
            int digit=temp2%10;
            int flag=1;
            for(int i=cnt;i>=1;i--){
                flag=flag*digit;
            }
            sum=sum+flag;
            temp2/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not:");
        int num=sc.nextInt();
        int sum=armstrongCheck(num);
        if(sum==num){
            System.out.println("It is armstrong number.");
        }else{
            System.out.println("It is not armstrong number.");
        }
        sc.close();
    }
}