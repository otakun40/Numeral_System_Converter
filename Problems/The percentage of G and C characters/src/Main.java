import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var sequence = scanner.next().trim().toLowerCase().toCharArray();

        int length = sequence.length;
        int gAndC = 0;

        for (char symbol: sequence) {
            if (symbol == 'c' || symbol == 'g') {
                gAndC++;
            }
        }

        System.out.println((double) gAndC / length * 100);
    }
}