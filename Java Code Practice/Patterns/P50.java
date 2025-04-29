package Patterns;
import java.util.*;
class P50 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of rows: ");
    int rows=sc.nextInt();
    char ch=(char)(64+(rows*(rows+1)/2));
    for(int i=rows;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(ch-- +" ");
        }
        System.out.println();
    }
    sc.close();
   } 
}
