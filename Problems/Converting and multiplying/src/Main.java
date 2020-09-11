import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        while (true) {
            String input = scanner.next();
            if ("0".equals(input)) {
                break;
            }
            array.add(input);
        }

        for (String in: array) {
            try {
                System.out.println(Integer.parseInt(in) * 10);
            } catch (NumberFormatException e) {
                System.out.printf("Invalid user input: %s\n", in);
            }
        }
    }
}