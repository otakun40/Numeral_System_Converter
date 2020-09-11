import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");

        String result = "";

        for (String word: str) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        System.out.println(result);
    }
}