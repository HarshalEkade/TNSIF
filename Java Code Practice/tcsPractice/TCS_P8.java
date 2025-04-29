package tcsPractice;
import java.util.*;
class TCS_P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        if(size != 4) {
            System.out.println("Invalid number of inputs. Expected 4.");
            return;
        }
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i] < 0) {
                System.out.println("Not valid inputs");
                return;
            }
        }
        int diff[]=new int[size-1];
        for(int i=0;i<size-1;i++){
            diff[i]=arr[i+1]-arr[i];
        }
        int common=-1;
        if(diff[0]==diff[1] || diff[0]==diff[2]){
            common=diff[0];
        }else if(diff[1]==diff[2]){
            common=diff[1];
        }

        if(common!=-1){
            System.out.println(common);
        }else{
            System.out.println("None");
        }
        sc.close();
    }
}
