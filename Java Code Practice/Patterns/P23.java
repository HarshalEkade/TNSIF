package Patterns;
import java.util.*;
public class P23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(rows*rows+" ");
            }
            System.out.println();
        }
    }
}
