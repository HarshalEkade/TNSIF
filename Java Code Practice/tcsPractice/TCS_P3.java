package tcsPractice;
import java.util.Scanner;

class SimplePangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int[] seen = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                seen[index] = 1;
            }
        }

        int total = 0;
        for (int i = 0; i < 26; i++) {
            total += seen[i];
        }

        if (total == 26) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}

