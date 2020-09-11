import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        if (Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(1)) +
                Character.getNumericValue(num.charAt(2)) == Character.getNumericValue(num.charAt(3)) +
                Character.getNumericValue(num.charAt(4)) + Character.getNumericValue(num.charAt(5))) {
            System.out.println("Lucky");
        }   else {
            System.out.println("Regular");
        }
    }
}