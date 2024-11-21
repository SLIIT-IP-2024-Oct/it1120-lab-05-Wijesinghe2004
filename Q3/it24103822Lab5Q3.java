import java.util.Scanner;

public class it24103822Lab5Q3 {

    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_3_TO_4_DAYS = 10; // 10%
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20; // 20%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start and end dates must be between 1 and 31.");
            return; // Exit the program
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return; // Exit the program
        }

        int numberOfDaysReserved = endDate - startDate;


        double discountRate = 0.0;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }


        double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = (totalAmount * discountRate) / 100;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.printf("Total amount before discount: Rs %.2f%n", totalAmount);
        System.out.printf("Discount applied: %.0f%%%n", discountRate);
        System.out.printf("Total amount to be paid: Rs %.2f%n", finalAmount);

        scanner.close();
    }
}
