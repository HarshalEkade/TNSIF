package tcsPractice;

import java.util.*;
class APSeriesSum{
    static int sumOfAP(int n,int a,int d){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a+(i*d);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of d: ");
        int d=sc.nextInt();
        int sum=sumOfAP(n, a, d);
        sc.close();
        System.out.println("The sum is: "+sum);

    }
}
