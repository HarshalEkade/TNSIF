package Patterns;
import java.util.*;
class P17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int rows=sc.nextInt();
        int num=rows;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(num+" ");
            }
            num--;
            System.out.println();
        }
        sc.close();
    }
}
