package tcsPractice;

import java.util.*;
class Array2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements for array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int positive[]=new int[size];
        int negative[]=new int[size];
        int posIndex=0;
        int negIndex=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                positive[posIndex++]=arr[i];
            }else{
                negative[negIndex++]=arr[i];
            }
        }
        int arr2[]=new int[size];
        posIndex=0;
        negIndex=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr2[i]=positive[posIndex++];
            }else{
                arr2[i]=negative[negIndex++];
            }
        }
        System.out.println("The final output :");
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
