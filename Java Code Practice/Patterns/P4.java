package Patterns;
import java.util.*;
class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows=sc.nextInt();
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(ch+" ");
                ch+=2;
            }
            System.out.println();
            sc.close();
        }
        
    }
}
