package Patterns;
import java.util.*;
class P72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int sp=1;sp<=rows-i;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch+"\t");
                }else{
                    System.out.print(i+"\t");
                }
            }
            for(int j=1;j<i;j++){
                if(i%2==0){
                    System.out.print(ch+"\t");
                }else{
                    System.out.print(i+"\t");
                }
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}
