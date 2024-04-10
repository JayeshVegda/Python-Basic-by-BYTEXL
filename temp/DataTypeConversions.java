import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTypeConversions {
    public static void main(String[] args) {
        // String to int
        String strToInt = "123";
        int intVal = Integer.parseInt(strToInt);
        System.out.println("String to int: " + intVal);

        // int to String
        intVal = 456;
        String intToStr = String.valueOf(intVal);
        System.out.println("int to String: " + intToStr);

        // String to long
        String strToLong = "123456789";
        long longVal = Long.parseLong(strToLong);
        System.out.println("String to long: " + longVal);

        // long to String
        longVal = 987654321;
        String longToStr = String.valueOf(longVal);
        System.out.println("long to String: " + longToStr);

        // String to double
        String strToDouble = "3.14";
        double doubleVal = Double.parseDouble(strToDouble);
        System.out.println("String to double: " + doubleVal);

        // double to String
        doubleVal = 2.718;
        String doubleToStr = String.valueOf(doubleVal);
        System.out.println("double to String: " + doubleToStr);

        // String to Date
        String strToDate = "2024-04-10";
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateVal = dateFormat.parse(strToDate);
            System.out.println("String to Date: " + dateVal);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Date to String
        Date dateVal = new Date();
        String dateToStr = dateVal.toString();
        System.out.println("Date to String: " + dateToStr);

        // char to String
        char charVal = 'A';
        String charToStr = String.valueOf(charVal);
        System.out.println("char to String: " + charToStr);

        // String to char
        String strToChar = "B";
        charVal = strToChar.charAt(0);
        System.out.println("String to char: " + charVal);

        // String to Object (String)
        String strToObject = "Hello";
        Object objFromString = strToObject;
        System.out.println("String to Object: " + objFromString);

        // Object (String) to String
        String strFromObject = (String) objFromString;
        System.out.println("Object to String: " + strFromObject);

        // int to long
        int intToLong = 123;
        long longFromInt = intToLong;
        System.out.println("int to long: " + longFromInt);

        // long to int
        long longToInt = 1234567890L;
        int intFromLong = (int) longToInt;
        System.out.println("long to int: " + intFromLong);

        // int to double
        int intToDouble = 456;
        double doubleFromInt = intToDouble;
        System.out.println("int to double: " + doubleFromInt);

        // double to int
        double doubleToInt = 3.14;
        int intFromDouble = (int) doubleToInt;
        System.out.println("double to int: " + intFromDouble);

        // char to int
        char charToInt = '7';
        int intFromChar = Character.getNumericValue(charToInt);
        System.out.println("char to int: " + intFromChar);

        // int to char
        int intToChar = 65;
        char charFromInt = (char) intToChar;
        System.out.println("int to char: " + charFromInt);

        // String to Boolean
        String strToBoolean = "true";
        boolean booleanVal = Boolean.parseBoolean(strToBoolean);
        System.out.println("String to Boolean: " + booleanVal);

        // Boolean to String
        booleanVal = false;
        String booleanToStr = String.valueOf(booleanVal);
        System.out.println("Boolean to String: " + booleanToStr);

        // Date to Timestamp (Assuming java.sql.Timestamp)
        Date dateToTimestamp = new Date();
        java.sql.Timestamp timestampVal = new java.sql.Timestamp(dateToTimestamp.getTime());
        System.out.println("Date to Timestamp: " + timestampVal);

        // Timestamp to Date
        java.sql.Timestamp timestampToDate = new java.sql.Timestamp(System.currentTimeMillis());
        Date dateFromTimestamp = new Date(timestampToDate.getTime());
        System.out.println("Timestamp to Date: " + dateFromTimestamp);

        // Binary to Decimal
        String binaryStr = "1010";
        int decimalFromBinary = Integer.parseInt(binaryStr, 2);
        System.out.println("Binary to Decimal: " + decimalFromBinary);

        // Decimal to Binary
        int decimalVal = 10;
        String binaryFromDecimal = Integer.toBinaryString(decimalVal);
        System.out.println("Decimal to Binary: " + binaryFromDecimal);

        // Hex to Decimal
        String hexStr = "1A";
        int decimalFromHex = Integer.parseInt(hexStr, 16);
        System.out.println("Hex to Decimal: " + decimalFromHex);

        // Decimal to Hex
        decimalVal = 26;
        String hexFromDecimal = Integer.toHexString(decimalVal);
        System.out.println("Decimal to Hex: " + hexFromDecimal);

        // Octal to Decimal
        String octalStr = "32";
        int decimalFromOctal = Integer.parseInt(octalStr, 8);
        System.out.println("Octal to Decimal: " + decimalFromOctal);

        // Decimal to Octal
        decimalVal = 26;
        String octalFromDecimal = Integer.toOctalString(decimalVal);
        System.out.println("Decimal to Octal: " + octalFromDecimal);
    }
}
