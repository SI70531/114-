import java.util.Scanner;

public class TreasureSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 m: ");
        int m = scanner.nextInt();
        System.out.print("請輸入 n: ");
        int n = scanner.nextInt();
        int result = combination(m, n);
        System.out.println("結果為: " + result);
        
        scanner.close();
    }
    public static int combination(int m, int n) {
        if (n < 0 || n > m) {
            return 0;
        }
        if (n == 0 || n == m) {
            return 1;
        }
        return combination(m - 1, n - 1) + combination(m - 1, n);
    }
}