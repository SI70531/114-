import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number A: ");
        int a = scanner.nextInt();

        System.out.print("Input a number B: ");
        int b = scanner.nextInt();

        System.out.println("選擇對應操作：(1)加法操作, (2)減法操作, (3)乘法操作, (4)除法, (5)整數除法：");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("ADD : " + (a + b));
                break;
            case 2:
                System.out.println("SUB : " + (a - b));
                break;
            case 3:
                System.out.println("MUL : " + (a * b));
                break;
            case 4:
                System.out.printf("DIV1 : %.2f\n", (double) a / b);
                break;
            case 5:
                System.out.println("DIV1 : " + (a / b));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}