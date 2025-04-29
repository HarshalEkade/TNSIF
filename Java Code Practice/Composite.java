import java.util.*;
class Composite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to check whether it is composite or not:");
        int num=sc.nextInt();

        int cnt=0;
        for(int i=1;i<=num;i++){

            if(num%i==0){
                cnt++;
            }
        }
        if(cnt>2){
            System.out.println(num+" is composite number");
        }else{
            System.out.println(num+" is not composite number");
        }
        sc.close();
    }
}
