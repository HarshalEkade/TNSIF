import java.util.*;
class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for series:");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        
        System.out.print(a+" , "+b);
        for(int i=1;i<num-1;i++){
            int c=a+b;
            System.out.print(" , "+c);
            a=b;
            b=c;

        }
        System.out.println();
        sc.close();
    }
}