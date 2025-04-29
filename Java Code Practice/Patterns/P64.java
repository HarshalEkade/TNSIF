package Patterns;
import java.util.*;
class P64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int sp=1;sp<=rows-i;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            for(int j=1;j<i;j++){
                System.out.print("*"+"\t");
            }
            
            System.out.println();
        }
        sc.close();
    }
}
