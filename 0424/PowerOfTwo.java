import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("不在測試範圍中!");
        } else {
            System.out.println(powerOfTwo(n));
        }
        
        scanner.close();
    }

    public static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * powerOfTwo(n - 1);
    }
}