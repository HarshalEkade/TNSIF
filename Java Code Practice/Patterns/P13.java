package Patterns;
import java.util.*;
class P13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        char ch=(char)(64);
        for(int i=1;i<=rows;i++){
            ch++;
            for(int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            ch-=i;
            System.out.println();
        }
    }
}
