import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to check whether it is palindrome number or not :");
        int num=sc.nextInt();

        int temp=num;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;

        }
        if(rev==num){
            System.out.println(num+" is palindrome number");
        }else{
            System.out.println(num+" is not palindrome number");
        }
        sc.close();
    }
}
