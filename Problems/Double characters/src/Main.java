import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var string = scanner.nextLine().toCharArray();
        var array = new char[string.length * 2];

        for (int i = 0, y = 0; i < string.length; i++, y += 2) {
            array[y] = string[i];
            array[y + 1] = string[i];
        }
        System.out.println(String.valueOf(array));
    }
}