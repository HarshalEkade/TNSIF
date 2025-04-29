package Patterns;
import java.util.*;
class P29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        char ch='a';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(ch++ +" ");
                }else{
                    System.out.print(i+" ");
                }
            }
            
            System.out.println();
        }
    }
}
