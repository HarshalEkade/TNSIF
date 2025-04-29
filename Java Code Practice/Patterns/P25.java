package Patterns;
import java.util.*;
class P25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
