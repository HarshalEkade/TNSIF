package Patterns;
import java.util.*;
class P62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            char ch=(char)(64+rows);
            for(int sp=1;sp<i;sp++){
                System.out.print("\t");
            }
            for(int j=rows;j>=i;j--){
                System.out.print(ch-- +"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
