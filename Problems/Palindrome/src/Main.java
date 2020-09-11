import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var word = scanner.next().toLowerCase();

        if (word.length() == 1) {
            System.out.println("yes");
            return;
        }

        String[] array = new String[2];
        array[0] = word.substring(0, word.length() / 2);

        if (word.length() % 2 == 1) {
            array[1] = word.substring(word.length() / 2 + 1);
        }   else {
            array[1] = word.substring(word.length() / 2);
        }

        array[1] = new StringBuilder(array[1]).reverse().toString();

        if (array[0].equals(array[1])) {
            System.out.println("yes");
        }   else {
            System.out.println("no");
        }
    }
}