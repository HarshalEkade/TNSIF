package tcsPractice;

import java.util.*;
class Array1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements for array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before any Operation: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int mid=arr.length/2;
        int arr2[]=new int[size];
        for(int i=0;i<mid;i++){
            arr2[i]=arr[i];
        }
        int temp=size-1;
        for(int i=mid;i<size;i++){
            arr2[i]=arr[temp];
            temp--;
        }
       
        
        System.out.println("After Operations: ");
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
