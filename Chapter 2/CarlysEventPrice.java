import java.util.Scanner;

public class CarlysEventPrice {
    
    public boolean isLargeEvent(int guests) {
        if (guests >= 50) {
        
        return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*  Carly's makes the food that makes it a party  *");
        System.out.println("*                                                *");

        System.out.println("**************************************************\n");

        System.out.println("How many guests do you have?");
        int guests = scan.nextInt();
        int pricePerGuest = 35;
        int totalPrice = pricePerGuest * guests;

        System.out.println("You have " + guests + " guests.");
        System.out.println("The price per guest is $" + pricePerGuest);
        System.out.println("Your total price is $" + totalPrice);

        CarlysEventPrice event = new CarlysEventPrice();
        boolean isLarge = event.isLargeEvent(guests); 

        if (isLarge) {
            System.out.println("This is a large event.");
        } else {
            System.out.println("This is not a large event.");
        }
    }
}
