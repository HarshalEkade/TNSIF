package Patterns;
import java.util.*;
class P16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter no.of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
