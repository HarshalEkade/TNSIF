package Patterns;
import java.util.*;
class P47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=i;
            }
            System.out.println();
        }
        sc.close();
    }
}
