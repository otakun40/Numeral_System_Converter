import java.util.*;

public class Main {
    static String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lower = upper.toLowerCase();
    static String symbols = ".,/!@#$%^&*()_+-=";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());

        System.out.println(generate(a, b, c, n));

    }

    static String generate(int a, int b, int c, int n) {
        Random random = new Random();

        StringBuilder upperSymbolsInPass = new StringBuilder();
        int lastUp = -1;
        for (int i = 1; i <= a; i++) {

            int position = random.nextInt(upper.length());
            if (position == lastUp) {
                i--;
                continue;
            }
            upperSymbolsInPass.append(upper.charAt(position));
            lastUp = position;
        }

        StringBuilder lowerSymbolsInPass = new StringBuilder();
        int lastLow = -1;
        for (int i = 0; i < b; i++) {
            int position = random.nextInt(lower.length());
            if (position == lastLow) {
                i--;
                continue;
            }
            lowerSymbolsInPass.append(lower.charAt(position));
            lastLow = position;
        }

        StringBuilder numbers = new StringBuilder("");
        int lastNum = -1;
        for (int i = 0; i < c; i++) {
            int num = random.nextInt(10);
            if (num == lastNum) {
                i--;
                continue;
            }
            numbers.append(num);
            lastNum = num;
        }

        StringBuilder result = new StringBuilder().append(upperSymbolsInPass)
                .append(lowerSymbolsInPass)
                .append(numbers);

        int resultLength = result.length();

        if (result.length() < n) {
            int lastSym = -1;
            for (int i = 0; i < n - resultLength; i++) {
                int sym = random.nextInt(symbols.length());
                if (sym == lastSym) {
                    i--;
                    continue;
                }
                result.append(symbols.charAt(sym));
                lastSym = sym;
            }
        }

        return result.toString();
    }
}