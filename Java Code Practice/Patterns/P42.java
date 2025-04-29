package Patterns;
import java.util.*;
class P42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            char ch=(char)(96+i);
            char ch1=(char)(64+i);
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch1-- +" ");
                }else{
                    System.out.print(ch-- +" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
