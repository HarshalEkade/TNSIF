package tcsPractice;

import java.util.*;
class SwapElements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter Swap Digit: ");
        int k=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter elements is an Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Before Swap: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[k]){
                int temp=arr[i-1];
                arr[i-1]=arr[size-k];
                arr[size-k]=temp;
            }
        }
        System.out.println("After Swap: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();

    }
}
