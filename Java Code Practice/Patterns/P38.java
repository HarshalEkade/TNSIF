package Patterns;
import java.util.*;
class P38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int num=1;
            char ch='a';
            for(int j=rows;j>=i;j--){
                if(rows%2==1){
                    if(j%2==1){
                        System.out.print(num++ +"\t");
                    }else{
                        System.out.print(ch++ +"\t");
                    }
                }else{
                    if(j%2==1){
                        System.out.print(ch++ +"\t");
                    }else{
                        System.out.print(num++ +"\t");
                    }
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
