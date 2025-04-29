package tcsPractice;
import java.util.*;
class TCS_P4 {
    static boolean isPrime(int num){
        int cnt=0;
        for(int i=1;i<=num;i++){
           if(num%i==0){
            cnt++;
           }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }
    static int findPrime(int num){
        int n=1;
        int cnt=0;
        while (cnt<num) {
            n++;
            if(isPrime(n)){
                cnt++;
            }
        }
        return n;
    }
    static int primeSum(int num1,int num2){
        int sum=0; 
        int temp=num1+num2;
        for(int i=num1;i<=temp;i++){
            int temp2=findPrime(i);
            sum+=temp2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of M: ");
        int m=sc.nextInt();
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        int sum=primeSum(m, n);
        System.out.println("The Sum is: "+sum);
        sc.close();

    }
}
