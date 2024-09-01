public class Triangle {

    public static void main(String[] args) {
    
        int row, space;
        
            for (row = 0; row < 7; row++) {
            for (space = 7 - row - 1; space > 0; space--) {
                System.out.print(" ");
            }

            for (space = 0; space < 2 * row + 1; space++) {
                System.out.print("T");
            }

            System.out.println();
        }
        
    }
    
}