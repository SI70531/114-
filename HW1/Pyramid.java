import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("請輸入層數，或輸入-1結束：");
            int n = scanner.nextInt();
            if (n == -1) {
                System.out.println("程式結束");
                return;
            }
            while (n <= 0) {
                System.out.println("輸入錯誤!");
                System.out.print("請輸入層數，或輸入-1結束：");
                n = scanner.nextInt();
            }
            System.out.print("請選擇類型：");
            int a = scanner.nextInt();
            while (a < 1 || a > 4) {
              System.out.println("輸入錯誤!");
                System.out.print("請選擇類型：");
             a = scanner.nextInt();
            }
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
        }
    }
}