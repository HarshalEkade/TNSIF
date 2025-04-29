package Patterns;
import java.util.*;
class P40 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows: ");
    int rows=sc.nextInt();
    for(int i=rows;i>=1;i--){
        char ch=(char)(64+i);
        int num=i;
        for(int j=1;j<=i;j++){
            if(rows%2==0){
                if(i%2==0){
                    System.out.print(num-- +" ");
                }else{
                    System.out.print(ch-- +" ");
                }
            }else{
                if(i%2==0){
                    System.out.print(ch-- +" ");
                }else{
                    System.out.print(num-- +" ");
                }
            }
           
        }
        System.out.println();
    }
    sc.close();
   } 
}
