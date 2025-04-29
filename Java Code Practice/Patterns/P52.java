package Patterns;
import java.util.*;
class P52 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    String str=sc.next();
    int arr[]=new int[str.length()];
    int cnt=0;
    for(int i=str.length()-1;i>=0;i--){
        arr[cnt]=str.charAt(i)-'0';
        cnt++;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            System.err.print(arr[i]*arr[i]+" ");
        }
    }
    System.out.println();
    sc.close();
   } 
}
