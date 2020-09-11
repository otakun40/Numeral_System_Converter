import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var word = scanner.next().toLowerCase();

        String abc = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(abc.contains(word));
    }
}