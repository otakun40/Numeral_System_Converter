import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        int length = stringBuilder.length();

        if (length % 2 == 0) {
            stringBuilder.delete(length / 2 - 1, length / 2 + 1);
        }   else if (length % 2 == 1) {
            stringBuilder.deleteCharAt(length / 2);
        }
        System.out.println(stringBuilder);
    }
}