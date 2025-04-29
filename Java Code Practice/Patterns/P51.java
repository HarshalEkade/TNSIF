package Patterns;
import java.util.*;
class P51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            char ch=(char)(64+i);
            for(int j=1;j<=i;j++){
                if(rows%2==0){
                    if(i%2==0){
                        System.out.print(j +" ");
                    }else{
                        System.out.print(ch-- +" ");
                    }
                }else{
                    if(i%2==0){
                        System.out.print(ch-- +" ");
                    }else{
                        System.out.print(j +" ");
                    }
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
