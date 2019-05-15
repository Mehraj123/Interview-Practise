package data_type;

import java.math.BigDecimal;

public class DoubleAndEqualAndComparable {
    public static void main(String[] args) {
        BigDecimal bigDecimalOne = new BigDecimal(1);
        BigDecimal bigDecimalTwo = new BigDecimal(1);
        int compare = bigDecimalOne.compareTo(bigDecimalTwo);
        System.out.println(compare);
        System.out.println(bigDecimalOne.equals(bigDecimalTwo));
    }
}
