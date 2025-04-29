package Patterns;
import java.util.*;
class P37 {
   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no.of rows: ");
    int rows=sc.nextInt();
    for(int i=1;i<=rows;i++){
        char ch='A';
        char ch1='a';
        for(int j=rows;j>=i;j--){
            if(i%2==1){
                System.out.print(ch++ +"\t");
            }else{
                System.out.print(ch1++ +"\t");
            }
        }
        System.out.println();
    }
    sc.close();
   }
}
