import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your total Income");
        int income = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String materials[] = new String[50];
        int amounts[] = new int[50];

        int totalExpenditure = 0;
        int count = 0;

        String type = " ";

        while (!(type.equals("done") || type.equals("Done") || type.equals("DONE"))) {

            System.out.println("Enter Type of Material or type (done to stop): ");
            type = sc.nextLine().trim();

            if (type.equals("done") || type.equals("Done") || type.equals("DONE")) {
                break;
            }

            System.out.println("Enter amount spent :");
            int amount = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            materials[count] = type;
            amounts[count] = amount;
            totalExpenditure += amount;

            count++;
        }

        int saving = income - totalExpenditure;

        System.out.println("Total Income :" + income);
        System.out.println("Total Expenditure :" + totalExpenditure);
        System.out.println("Total Savings :" + saving);

        System.out.println("Materials or Expenses :");
        for (int i = 0; i < count; i++) {
            System.out.println(materials[i] + " = " + amounts[i]);
        }

        sc.close();
    }
}
