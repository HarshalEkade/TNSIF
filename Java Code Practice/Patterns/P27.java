package Patterns;
import java.util.*;
class P27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        char ch=(char)(65+rows);
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }

    }
}
