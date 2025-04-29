package tcsPractice;
import java.util.*;
class TCS_P6 {
    static int factorial(int num){
        int temp=1;
        for(int i=1;i<=num;i++){
            temp=temp*i;
        }
        return temp;
    }
    static int stringLength(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            cnt++;
        }
        return cnt;
    }
    static int permutaion(String str){
        int num=stringLength(str);
        int result=factorial(num);
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>1){
                result=result/factorial(freq[i]);
            }
        }
        return result;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str=sc.nextLine();
    int permutaion=permutaion(str);
    System.out.println("All possible permutations are: "+permutaion);
    sc.close();
   } 
}
