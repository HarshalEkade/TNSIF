package tcsPractice;

import java.util.*;

class TCS_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter Str2: ");
        String str2 = sc.nextLine();
        int len1 = 0;
        int len2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            len1++;
        }
        for (int i = 0; i < str2.length(); i++) {
            len2++;
        }
        if (len1 == 0 || len2 == 0 || len1 != len2) {
            System.out.println("Invalid Input");
        } else {
            int freq1[] = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                freq1[str1.charAt(i)]++;
            }
            int freq2[] = new int[256];
            for (int i = 0; i < str2.length(); i++) {
                freq2[str2.charAt(i)]++;
            }
            boolean flag = true;
            for (int i = 0; i < 256; i++) {
                if ((freq1[i] != freq2[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print("True");
            } else {
                System.out.print("False");
            }
        }
        sc.close();
    }
}
