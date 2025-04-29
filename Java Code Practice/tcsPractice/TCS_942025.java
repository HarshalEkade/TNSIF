package tcsPractice;

import java.util.*;
class MatrixPrimeValidator{
    static boolean isPrime(int num){
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        // Read the whole input as a line
        String input=sc.nextLine();

        // Split the input by spaces
        String[] parts= input.split(" ");

        //Convert the string part into an integer array
        int[] numbers=new int[parts.length];

        for(int i=0;i<parts.length;i++){
            numbers[i]=Integer.parseInt(parts[i]);
        }

        int rows=numbers[0];
        int cols=numbers[1];

        int totalNeeded=rows*cols;
        sc.close();
        if(numbers.length-2>totalNeeded){
            System.out.println("Wrong input");
            return;
        }
        // matrix create
        int[][] matrix=new int[rows][cols];
        int index=2;  /// start filling from 3rd number

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(index<numbers.length){
                    matrix[i][j]=numbers[index];
                    index++;
                }else{
                    matrix[i][j]=0; //Fill remaining with 0 if less inputs
                }
            }
        }

        // check each row for at least one prime
        boolean allRowsValid=true;
        for(int i=0;i<rows;i++){
            boolean rowHasPrime=false;

            for(int j=0;j<cols;j++){
                if(isPrime(matrix[i][j])){
                    rowHasPrime=true;
                    break;
                }
            }
            if(!rowHasPrime){
               allRowsValid=false;
               break;
            }
        }
        if(allRowsValid){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
        
    }
}
