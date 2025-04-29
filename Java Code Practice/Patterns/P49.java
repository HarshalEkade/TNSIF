package Patterns;
import java.util.*;
class P49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        int num=2;
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
