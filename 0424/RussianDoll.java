import java.util.Scanner;

public class RussianDoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入層數:");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("總高度為:" + calculateTotalHeight(n));
        }
        
        scanner.close();
    }

    public static int calculateTotalHeight(int n) {
        if (n == 1) {
            return 1;
        }
        return (2 * n - 1) + calculateTotalHeight(n - 1);
    }
}