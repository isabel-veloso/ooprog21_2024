import java.util.Scanner;

public class SortNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three numbers:");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    if (num1 <= num2 && num2 <= num3) {
      System.out.println("Your number are already in ascending order. \n" +  "" + num1 + " " + num2 + " " + num3);
    } else if (num1 >= num2 && num2 >= num3) {
      System.out.println("Your numbers are in descending order: \n" + " "+ num1 + " " + num2 + " " + num3);
      System.out.println("Here's the ascending order: \n" + " "+ num3 + " " + num2 + " " + num1);
    } else {
      int min = Math.min(Math.min(num1, num2), num3);
      int max = Math.max(Math.max(num1, num2), num3);
      int mid = (num1 + num2 + num3) - min - max;
      System.out.println("Your numbers are not in order! \nNumbers in descending order: \n" + max + " " + mid + " " + min);
      System.out.println("Numbers in ascending order: \n" + min + " " + mid + " " + max);
    }

    scanner.close();
  }

}
