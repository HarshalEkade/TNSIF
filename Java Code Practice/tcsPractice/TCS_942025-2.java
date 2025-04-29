package tcsPractice;
import java.util.*;
class TCS_942025 {
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
        int count=0;
        for(;count<num;){
            n++;
            if(isPrime(n)){
                count++;
            }

        }
        return n;

    }
    static int digitSum(int num){
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m number: ");
        int m=sc.nextInt();
        System.out.print("Enter n number: ");
        int n=sc.nextInt();
        int nPrime=findPrime(n);
        int mPrime=findPrime(m);
        int nSum=digitSum(nPrime);
        int mSum=digitSum(mPrime);
        int result=m*mSum;
        System.out.println("The final result: "+result);

        sc.close();

    }
}
