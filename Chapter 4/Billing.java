import java.util.Scanner;

public class Billing {

    public static void computeBill(double price) {
        double tax = 0.08 * price;
        double total = price + tax;
        System.out.println("Total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double tax = 0.08 * subtotal;
        double total = subtotal + tax;
        System.out.println("Total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = (couponDiscount / 100.0) * subtotal;
        double discountedPrice = subtotal - discount;
        double tax = 0.08 * discountedPrice;
        double total = discountedPrice + tax;
        System.out.println("Total price for the bill is: $" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the coupon discount percentage: ");
        int couponDiscount = scanner.nextInt();

        computeBill(price);
        computeBill(price, quantity);
        computeBill(price, quantity, couponDiscount);

        scanner.close();
    }
}