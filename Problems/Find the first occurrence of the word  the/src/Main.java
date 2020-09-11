import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var string = scanner.nextLine().toLowerCase();

        System.out.println(string.indexOf("the"));
    }
}