package Patterns;
import java.util.*;
class P63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int ch=64+i;
            for(int sp=1;sp<i;sp++){
                System.out.print("\t");
            }
            for(int j=rows;j>=i;j--){
                if(rows%2!=0){
                    if(ch%2==0){
                        System.out.print(ch +"\t");
                    }else{
                        System.out.print((char)ch +"\t");
                    }
                    ch++;
                }else{
                    if(ch%2==0){
                        System.out.print((char)ch +"\t");
                    }else{
                        System.out.print(ch +"\t");
                    }
                    ch++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
