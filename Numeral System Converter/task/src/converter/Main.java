package converter;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        // it calls method convert(), if input parameters are correct
        try {
            System.out.println(converter.convert(scanner.next(), scanner.next(), scanner.next()));
        } catch (NoSuchElementException e) {
            System.out.println("Error");
        }
    }
}
