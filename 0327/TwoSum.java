import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入陣列長度:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("輸入陣列:");
        for (int i = 0; i < n; i++) {
            System.out.print("Index" + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.print("輸入目標值:");
        int target = scanner.nextInt();

        boolean result = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result = true;
                    break;
                }
            }
            if (result) break;
        }

        System.out.println("結果: " + result);

        scanner.close();
    }
}