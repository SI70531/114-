import java.util.Scanner;

public class HW1_114403524{
    static int round;
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
                System.out.print("請輸入陣列長度 n: ");
                int count = scanner.nextInt();
                while(count <= 0){
                    System.out.println("輸入錯誤!");
                    System.out.print("請輸入陣列長度 n: ");
                    count = scanner.nextInt();
                }
                int[] arr = new int[count];
                System.out.printf("請輸入%d個整數: %n", count);
                for(int i = 0; i < count ; i++){
                    arr[i] = scanner.nextInt();
                }
                round = 1;
                System.out.printf("%n開始排序%n");
                quickSort(arr, 0, count - 1);
                System.out.println("最終排序結果:");
                for (int i = 0; i < count; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.printf("%n%n");
                break;
            }
        }
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        System.out.printf("第%d輪分堆(以%d為基準): ", round, pivot);
        for (int j = 0; j < arr.length; j++) {
            int num = arr[j];
            System.out.print(num + " ");
        }
        System.out.println();
        round++;

        return i + 1;
    }
}