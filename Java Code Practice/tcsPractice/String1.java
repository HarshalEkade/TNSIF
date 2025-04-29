package tcsPractice;

import java.util.*;
class String1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        String str1=str.trim();
        int vowelsCnt=0;
        int consonentCnt=0;
        int spaceCnt=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O'
            || str1.charAt(i)=='U' || str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i'
            || str1.charAt(i)=='o' || str1.charAt(i)=='u'){
                vowelsCnt++;
            }else if(str1.charAt(i)==' '){
                spaceCnt++;
            }else{
                consonentCnt++;
            }
        }
        System.out.println("The number of vowels are :"+vowelsCnt);
        System.out.println("The number of consonents are :"+consonentCnt);
        System.out.println("The number of white spaces are :"+spaceCnt);
        sc.close();
    }
}