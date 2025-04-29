package tcsPractice;
import java.util.*;
class SumOfNMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N*10;i++){
            if(i%10==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
