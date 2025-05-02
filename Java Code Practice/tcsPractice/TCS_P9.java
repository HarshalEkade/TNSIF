package tcsPractice;

import java.util.*;
class TCS_P9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        int n1=1;
        while(temp>0){
            n1=n1*2;
            temp--;
        }
        int result=n1-1;
        System.out.println(result);
        sc.close();
    }
}