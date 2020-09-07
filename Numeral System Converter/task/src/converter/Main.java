package converter;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int dec = 7;
        System.out.printf("%d = 0b%s", dec, decimalToBinaryConvert(dec));

    }

    static String decimalToBinaryConvert(int dec) {
        StringBuffer binary = new StringBuffer("");
        ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            arrayList.add(dec % 2);
            dec /= 2;
        }   while (dec != 0);

        for (int i = 0; i < arrayList.size(); i++) {
            binary = binary.append(arrayList.get(i));
        }
        binary.reverse();
        return binary.toString();
    }
}
