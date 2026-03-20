import java.util.Scanner;

public class SumCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個數字：");
        int n = scanner.nextInt();
        int sum = 0;
        String numbersFound = ""; 
        for (int i = 1; i < n; i++) {
            if (!((i % 3 == 0 || i % 5 == 0) && (i % 7 != 0))) {
                continue;
            }
            sum += i;
            numbersFound += i + " ";
        }


        System.out.println("符合條件的數字為：" + numbersFound);
        System.out.println("符合條件的數字總和為：" + sum);

        scanner.close();
    }
}