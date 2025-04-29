import java.util.*;
class DuckNumber{
    static boolean DuckCheck(String num){
        if(num.charAt(0)=='0'){
            return false;
        }
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is duck number or not:");
        String num=sc.next();
       
        if(DuckCheck(num)){
            System.out.println("It is Duck number");
        }else{
            System.out.println("It is not duck number");
        }
        sc.close();

    }
}