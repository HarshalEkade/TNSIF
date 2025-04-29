package tcsPractice;

import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int arraySum=0 ;
        int sum=(size*(size+1))/2;

        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            arraySum=arraySum+arr[i];
        }
        System.out.println("The missing number is: "+(sum-arraySum));
        sc.close();

    }
}
