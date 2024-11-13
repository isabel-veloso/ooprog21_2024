import java.util.Scanner;

public class SpoonerismGenerator {

   private static String getWord(String prompt) {
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt);
      return scanner.nextLine();
   }

   private static int vowelIndex(String word) {
      for (int i = 0; i < word.length(); i++) {
         char ch = Character.toLowerCase(word.charAt(i));
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return i;
         }
      }
      return -1; 
   }

   public static void run() {
      String word1 = getWord("Enter first word: ");
      String word2 = getWord("Enter second word: ");
      
      int vowelIndex1 = vowelIndex(word1);
      int vowelIndex2 = vowelIndex(word2);
      
      if (vowelIndex1 == -1 || vowelIndex2 == -1 || vowelIndex1 == 0 || vowelIndex2 == 0) {
         System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
      } else {
         String firstPart1 = word1.substring(0, vowelIndex1);
         String firstPart2 = word2.substring(0, vowelIndex2);
         String rest1 = word1.substring(vowelIndex1);
         String rest2 = word2.substring(vowelIndex2);
      
         String spoonerizedWord1 = firstPart2 + rest1;
         String spoonerizedWord2 = firstPart1 + rest2;
      
         System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
      }
   }

   public static void main(String[] args) {
      run();
   }
}