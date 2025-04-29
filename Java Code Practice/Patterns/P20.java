package Patterns;
import java.util.*;
class P20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            char ch=(char)(64+rows);
            for(int j=rows;j>=i;j--){
                System.out.print(ch-- +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
