import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var string = new StringBuilder(scanner.next());
        var num = scanner.nextInt();

        if (num < string.length()) {
            String piece = string.substring(0, num);
            string.delete(0, num);
            string.append(piece);
        }
        System.out.println(string);
    }
}