package Patterns;
import java.util.*;
class P19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int num=i;
            for(int j=rows;j>=i;j--){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
