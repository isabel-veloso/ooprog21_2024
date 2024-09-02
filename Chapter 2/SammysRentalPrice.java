import java.util.Scanner;

public class SammysRentalPrice{
    public static void main(String[] args){
    
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S                                          S");
        System.out.println("S     Sammy's makes it fun in the sun!     S");
        System.out.println("S                                          S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many minutes did you rent our equipment?");
        int minutesRented = scan.nextInt();
        
        int hours = minutesRented / 60;
        int minutes = minutesRented % 60;
        int hourlyRate = 40;
        
        int totalRate = (hours * hourlyRate) + minutes;

        System.out.println("You rented for an equipment for:");
        System.out.println("Hour: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hourly rate is " + hourlyRate + "per hour and $1 per addiotional minute.");
        System.out.println("Your total rental cost is: $" + totalRate);

    }
}
