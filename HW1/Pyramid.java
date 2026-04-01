import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入層數：");
        int a = scanner.nextInt();
        System.out.print("請選擇類型：");
        int n = scanner.nextInt();
        if(n < 1 && n > 5){
            System.out.println("請輸入1到5之間的數字");
            return;
        }