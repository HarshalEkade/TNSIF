package Patterns;
import java.util.*;
class P71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            int num=rows;
            for(int sp=1;sp<rows-i;sp++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                System.out.print(num-j+"\t");
            }
            num-=i;
            for(int j=0;j<i+1;j++){
                System.out.print(num++ +"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
