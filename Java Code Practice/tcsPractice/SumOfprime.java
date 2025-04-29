package tcsPractice;

import java.util.*;
class SumOfPrime{
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
    static int sumOfDigit(int M,int N){
        int sum=0;
        for(int i=N;i<=M;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        System.out.println("Enter the value of M: ");
        int M=sc.nextInt();
        sc.close();
        if(N>=M){
            return;
        }
        int sum=sumOfDigit(M, N);
        System.out.println("Sum :"+sum);
    }
}