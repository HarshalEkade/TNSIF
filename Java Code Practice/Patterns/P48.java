package Patterns;
import java.util.*;
class P48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int num=rows;
            char ch=(char)(96+rows);
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(num-- +" ");
                }else{
                    System.out.print(ch-- +" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
