package Patterns;
import java.util.*;
class P32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows=sc.nextInt();
        char ch='a';
        int num=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch+" ");
                }else{
                    System.out.print(num+" ");
                }
                ch++;
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
