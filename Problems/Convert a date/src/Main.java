import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var date = scanner.next().split("-");
        System.out.printf("%s/%s/%s", date[1], date[2], date[0]);
    }
}