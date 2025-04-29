package Patterns;
import java.util.*;
class P39 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of rows: ");
    int rows=sc.nextInt();
    for(int i=rows;i>=1;i--){
        int num=i;
        char ch=(char)(96+i);
        for(int j=1;j<=i;j++){
            if(j%2==0){
                System.out.print(ch+" ");
            }else{
                System.out.print(num+" ");
            }
            ch--;
            num--;
        }
        System.out.println();
    }
    sc.close();
   } 
}
