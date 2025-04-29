package Patterns;
import java.util.*;
public class P61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++){
                System.out.print("\t");
            }
            for(int k=rows;k>=i;k--){
                System.out.print((rows+1)-k+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
