package Patterns;
import java.util.*;
class P56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        
        for(int i=1;i<=rows;i++){
            char ch=(char)(64+rows-i);
            for(int sp=1;sp<=rows-i;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(((char)(ch+j))+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
