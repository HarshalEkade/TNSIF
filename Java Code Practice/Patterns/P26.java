package Patterns;
import java.util.*;
class P26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                if(i%2==0){
                    System.out.print((char)(64+j)+" ");
                }else{
                    System.out.print((char)(96+j)+" ");
                }
            }
            System.out.println();
        }
    }
}
