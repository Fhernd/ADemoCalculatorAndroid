package co.ortizol.ademocalculator.util;

/**
 * Utility class.
 */
public class Utility {
    /**
     * Get the double value of a string which represents a double.
     * @param s The string which represents a double value.
     * @return The converted double value.
     */
    public static double getDouble(String s){
        if (validString(s)){
            return Double.parseDouble(s);
        }

        return 0;
    }

    /**
     * Check if a string has a valid representation
     * @param s The string to check.
     * @return true if the string is valid, false otherwise.
     */
    private static boolean validString(String s){
        if (s == null){
            return false;
        }
        if (s.trim().equalsIgnoreCase("")){
            return false;
        }

        return true;
    }

    /**
     * Check if a string has an invalid representation:
     * @param s The string to check.
     * @return true if the is invalid, false otherwise.
     */
    private static boolean invalidString(String s){
        return !validString(s);
    }
}
