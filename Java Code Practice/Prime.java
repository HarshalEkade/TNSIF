import java.util.*;
class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to check it is prime or not :");
        int num=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt>2){
            System.out.println(num+" is not prime number");
        }
        if(cnt==2){
            System.out.println(num+" is prime number");
        }
        sc.close();    
        
    }
}
