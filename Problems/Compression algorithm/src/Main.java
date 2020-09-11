import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var sequence = scanner.next().toCharArray();
        StringBuilder result = new StringBuilder("");

        if (sequence.length == 1) {
            System.out.println(sequence[0] + "1");
            return;
        }

        int count = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == sequence[i - 1]) {
                count++;
                if (i == sequence.length - 1) {
                    result.append(String.valueOf(sequence[i])).append(count);
                }
            } else {
                result.append(String.valueOf(sequence[i - 1])).append(count);
                count = 1;
            }
        }

        if (sequence[sequence.length - 1] != sequence[sequence.length - 2]) {
            result.append(String.valueOf(sequence[sequence.length - 1])).append(1);
        }

        System.out.println(result);
    }
}
