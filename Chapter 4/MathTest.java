public class MathTest {

   public static void main(String[] args) {
   
      double squareRoot = Math.sqrt(81);
      System.out.println("SQRT: " + squareRoot);
   
      double sine = Math.sin(10);
      System.out.println("SIN: " + sine);
   
      double cosine = Math.cos(10);
      System.out.println("COS: " + cosine);
   
      double floor= Math.floor(50);
      System.out.println("FLOOR: " + floor);
   
      double ceil = Math.ceil(30);
      System.out.println("CEIL: " + ceil);
   
      long round = Math.round(22.5);
      System.out.println("ROUND: " + round);
   
      int maxNumber = Math.max(77, 68);
      System.out.println("MAX: " + maxNumber);
   
      int minNumber = Math.min(77, 68);
      System.out.println("MIN: " + minNumber);
   
      double randomNumber = Math.random(); 
      System.out.println("RANDOM: " + randomNumber);
   }
}