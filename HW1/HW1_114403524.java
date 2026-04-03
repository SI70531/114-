import java.util.Scanner;

public class HW1_114403524{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("選擇作業1 or 作業2, 或輸入-1結束: ");
            int option = scanner.nextInt();
            if (option == -1) {
                System.out.println("程式結束!");
                scanner.close();
                return;
            }
            while (option != 1 && option != 2) {
                    System.out.println("輸入錯誤!");
                    System.out.print("選擇作業一 or 作業二, 或輸入-1結束: ");
                    option = scanner.nextInt();
                    if (option == -1) {
                    System.out.println("程式結束!");
                    scanner.close();
                    return;
                    }
            }
            switch (option) {
            case 1:         
                System.out.print("請輸入層數: ");
                int n = scanner.nextInt();
                while (n <= 0 ) {
                    System.out.println("輸入錯誤!");
                    System.out.print("請輸入層數: ");
                    n = scanner.nextInt();
                }
                System.out.print("請選擇類型(1上 2下 3左 4右): ");
                int a = scanner.nextInt();
                while (a < 1 || a > 4) {
                    System.out.println("輸入錯誤!");
                    System.out.print("請選擇類型(1上 2下 3左 4右): ");
                    a = scanner.nextInt();
                }
                System.out.println();
                System.out.println("--- 輸出結果 ---");
                switch (a) {
                case 1:
                    for ( int i = 1; i <= n; i++) {
                        for ( int j = 1; j <= n -i; j++) {
                            System.out.print(" ");
                        }
                        for ( int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for ( int i = n; i >= 1; i--) {
                        for ( int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for ( int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= n; i++) {
                        for (int j = n - i; j >= 1; j--){
                            System.out.print(" "); 
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                            }
                        for (int k = 1; k <= i; k++) {  
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                       break;
                case 4:
                    for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                            }
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                             System.out.print("*"); 
                            }
                        System.out.println();
                    }
                    break;
                }
                System.out.println();
                break;
            case 2:
                System.out.println("請輸入陣列長度: ");
            }
        }
    }
}