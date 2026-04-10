import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入字串: ");
        String input = scanner.nextLine();

        String result = reverseString(input);

        System.out.println("結果: " + result);
        scanner.close();
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}