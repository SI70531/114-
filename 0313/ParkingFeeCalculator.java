import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input vehicle type: ");
        int type = scanner.nextInt();

        System.out.print("Input parking hours: ");
        int hour = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Invalid vehicle type");
            } 
        else if (hour <= 0) {
            System.out.println("Invalid parking hours");
            } 
        else if (type == 1) {
            System.out.println(hour * 10);
            } 
            else if (type == 2) {
            System.out.println(hour * 30);
            } 
        else if (type == 3) {
            System.out.println(hour * 50);
            }

        scanner.close();
    }
}