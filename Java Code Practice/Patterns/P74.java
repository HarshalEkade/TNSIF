package Patterns;
import java.util.*;
class P74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            char ch1='A';
            char ch2='a';
            for(int sp=1;sp<=rows-i;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(ch1++ +"\t");
                }else{
                    System.out.print(ch2++ +"\t");
                }
            }
            ch1='A';
            ch2='a';
            ch1=(char)(ch1+i-1);
            ch2=(char)(ch2+i-1);

            for(int j=1;j<i;j++){
                if(i%2!=0){
                    System.out.print(--ch1 +"\t");
                }else{
                    System.out.print(--ch2 +"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
