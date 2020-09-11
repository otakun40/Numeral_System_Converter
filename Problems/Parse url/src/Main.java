import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next().trim();

        String[] array = url.substring(url.indexOf('?') + 1).split("&");

        String[][] array2 = new String[array.length][2];

        boolean hasPassword = false;
        String password = "";

        for (int i = 0; i < array.length; i++) {

            array2[i] = array[i].split("=");

            if ("pass".equals(array2[i][0])) {
                hasPassword = true;
                password = array2[i][1];
            }

            if (array2[i].length == 1) {
                System.out.printf("%s : not found\n", array2[i][0]);
            }   else {
                System.out.printf("%s : %s\n", array2[i][0], array2[i][1]);
            }
        }

        if (hasPassword) {
            System.out.printf("password : %s", password);
        }
    }
}