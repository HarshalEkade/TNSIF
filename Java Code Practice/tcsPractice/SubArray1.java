package tcsPractice;
import java.util.*;
class SubArraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        int size=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int K=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements into an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // Main logic
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==K){
                    for(int k=i;k<=j;k++){
                        System.out.print("Sub-Array found: "+arr[k]+" ");
                    }

                }
            }
            sc.close();
        }
    }
}