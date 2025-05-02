package tcsPractice;

import java.util.Scanner;

public class TCS_P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter no.of rows and columns: ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            if(i%2==1){
                for(int j=columns-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }else{
                for(int j=0;j<columns;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
