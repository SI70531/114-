import java.util.Arrays;
import java.util.Scanner;

public class FindKthLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入陣列長度: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("輸入陣列: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Index" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("輸入目標值: ");
        int k = scanner.nextInt();

        Arrays.sort(numbers);
        int result = numbers[length - k];

        System.out.println("結果: " + result);
        scanner.close();
    }
}