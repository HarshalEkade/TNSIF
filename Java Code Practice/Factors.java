import java.util.*;
class Factors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for finding factors: ");
        int num=sc.nextInt();
        System.out.println("The Factors of "+num+" are:");
        for(int i=1;i<=num;i++){
            if(num%i==0 || num==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
