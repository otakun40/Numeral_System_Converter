package converter;

public class Converter {

    // this method converts integer part of number
    private String integerPart(int sourceRadix, String sourceNumber, int targetRadix) {
        String integerNumber = sourceNumber.split("\\.")[0];
        int numberInDecimal = sourceRadix == 1? integerNumber.length():
                Integer.parseInt(integerNumber, sourceRadix);

        return targetRadix == 1? "1".repeat(numberInDecimal) : Integer.toString(numberInDecimal, targetRadix);
    }

    // this method converts fractional part of number
    private String fractionalPart(int sourceRadix, String sourceNumber, int targetRadix){
        if (sourceNumber.split("\\.").length == 1) {
            return "";
        }
        char[] fractionalPart = sourceNumber.split("\\.")[1].toCharArray();
        double f = 0; // fractional part in decimal

        for (int i = 0; i < fractionalPart.length; i++) {  // getting decimal fractional part from source number
            f += Character.getNumericValue(fractionalPart[i]) / Math.pow(sourceRadix, i + 1);
        }

        StringBuilder stringBuilder = new StringBuilder(".");  //  getting new number system fractional part
        for (int j = 0; j < 5; j++) {
            f = f * targetRadix;
            stringBuilder.append(Integer.toString((int) f, targetRadix));
            f -= (int) f;
        }
        return stringBuilder.toString();
    }

    // this method returns a string with a number in the target number system, if the parameters are correct
    public String convert(String sourceRadix, String sourceNumber, String targetRadix) {
        try {
            // check that radix is a number
            int sRadix = Integer.parseInt(sourceRadix);
            int tRadix = Integer.parseInt(targetRadix);

            // check that the radix is within the acceptable range
            if (sRadix > 36 || tRadix > 36 || sRadix <= 0 || tRadix <= 0) {
                throw new NumberFormatException();
            }

            return (integerPart(sRadix, sourceNumber, tRadix) + fractionalPart(sRadix, sourceNumber, tRadix));

        }   catch (NumberFormatException e) {
            System.out.println(e.toString());
            return "Error";
        }
    }
}
