package Patterns;
import java.util.*;
class P45 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of rows: ");
    int rows=sc.nextInt();
    for(int i=1;i<=rows;i++){
        char ch=(char)(64+rows);
        for(int j=1;j<=rows;j++){
            if(i%2==0){
                System.out.print(j+" ");
            }else{
                System.out.print(ch-- +" ");
            }
        }
        System.out.println();
    }
    sc.close();
   } 
}
