package Patterns;
import java.util.*;
class P46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            int num=i;
            for(int j=rows;j>=i;j--){
                System.out.print(num+" ");
                num+=i;
            }
            System.out.println();
        }
        sc.close();
    }
}
