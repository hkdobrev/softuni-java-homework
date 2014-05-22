import java.util.Scanner;

class GenerateThreeLetterWords {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String base = scan.next();
        int length = base.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    System.out.print("" + base.charAt(i) + base.charAt(j) + base.charAt(k) + " ");
                }
            }
        }

        System.out.println();
    }
}