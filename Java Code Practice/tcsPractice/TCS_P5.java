package tcsPractice;
import java.util.*;
class TCS_P5 {

    static double sumOfSquaredDifference(int arr[],double mean){
        double sumOfSquared=0;
        for(int i=0;i<arr.length;i++){
            double multi=(arr[i]-mean)*(arr[i]-mean);
            sumOfSquared=sumOfSquared+multi;
        }
        return sumOfSquared;
    }

    static double meanCalculator(int[] arr){
        int sum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt++;
            sum+=arr[i];
        }
        return (double)sum/cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Input: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        double mean=meanCalculator(arr);
        double sumOfSquare=sumOfSquaredDifference(arr, mean);
        double divide=sumOfSquare/size;
        System.out.println("The final answer: %.2f/n "+Math.sqrt(divide));

        sc.close();

    }
}
