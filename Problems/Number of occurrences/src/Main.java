import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var phrase = scanner.nextLine();
        var fragment = scanner.nextLine();

        var modifyString = phrase.replaceAll(fragment, "|");
        int count = 0;
        for (char symbol: modifyString.toCharArray()) {
            if (symbol == '|') {
                count++;
            }
        }

        System.out.println(count);
    }
}