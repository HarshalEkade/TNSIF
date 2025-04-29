package Patterns;
import java.util.*;
class P36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int rows=sc.nextInt();
        int totalLetters=rows*(rows+1)/2;
        char ch=(char)(64+totalLetters);
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
            sc.close();
        }
    }
}
