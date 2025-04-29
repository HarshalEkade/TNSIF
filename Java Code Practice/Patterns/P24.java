package Patterns;
import java.util.*;
class P24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("$"+" ");
                }else{
                    System.out.print((char)(96+j)+" ");
                }
            }
            System.out.println();
        }
    }
}
