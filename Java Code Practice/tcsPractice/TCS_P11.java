package tcsPractice;
import java.util.*;
public class TCS_P11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two Temperature: ");
        int temp1=sc.nextInt();
        int temp2=sc.nextInt();
        String str1="";
        String str2="";

        if(temp1<10){
            str1="It's very cool";
        }else if(temp1>10 && temp1<20){
            str1="It's cold";
        }else{
            str1="It's warm";
        }
        if(temp2<10){
            str2="It's very cool";
        }else if(temp2>10 && temp2<20){
            str2="It's cold";
        }else{
            str2="It's warm";
        }
        float avg=(temp1+temp2)/2;
        System.out.println(str1+","+str2+","+avg+","+temp2+","+temp1);
        sc.close();
    }
}
