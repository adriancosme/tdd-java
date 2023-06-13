import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberConverter {
    static LinkedHashMap<Integer, String> romanNumerals = new LinkedHashMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};
    public static String decimalToRoman(int n) {
        if(n <= 0 || n > 3999) {
            throw new IllegalArgumentException("Invalid number");
        }
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            int value  = entry.getKey();
            String symbol = entry.getValue();
            while (n >= value) {
                roman.append(symbol);
                n -= value;
            }
        }
        return roman.toString();
    }
}
