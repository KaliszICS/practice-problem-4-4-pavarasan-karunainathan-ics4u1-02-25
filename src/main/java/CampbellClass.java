/**
 * Definition of the CampbellClass utility class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */
final class CampbellClass{
    private CampbellClass(){}

    /**
     * Converts an integer to String
     * @param num The integer to be converted
     * @return The String version of the integer
     */
    public static String convertString(int num){return String.valueOf(num);}
    
    /**
     * Converts a double to String
     * @param num The double to be converted
     * @return The String version of the double
     */
    public static String convertString(double num){return String.valueOf(num);}
    
    /**
     * Converts a boolean to String
     * @param bool The boolean to be converted
     * @return The String version of the boolean
     */
    public static String convertString(boolean bool){return String.valueOf(bool);}
    
    /**
     * Converts a character to String
     * @param c The character to be converted
     * @return The String version of the character
     */
    public static String convertString(char c){return String.valueOf(c);}
    
    /**
     * Converts an integer amount of metres to centimetres
     * @param num The amount of metres
     * @return The amount of centimetres
     */
    public static int convertMetersToCenti(int num){return num*100;}
    
    /**
     * Converts a double amount of metres to centimetres
     * @param num The amount of metres
     * @return The amount of centimetres
     */
    public static double convertMetersToCenti(double num){return num*100;}
    
    /**
     * Removes all non alphabetic characters from a String
     * @param s The String to remove characters from
     * @return The String without non alphabetic characters
     */
    public static String removeNonAlpha(String s){
        return s.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Removes all non alphabetic characters from a String, then standardizes casing
     * @param s The String to remove characters from
     * @param casing If true, returns the String as all uppercase, otherwise returns the String with all lowercase
     * @return The String without non alphabetic characters, either all uppercase or all lowercase
     */
    public static String removeNonAlpha(String s, boolean casing){
        String newString = s.replaceAll("[^a-zA-Z]", "");
        if(casing) return newString.toUpperCase();
        return newString.toLowerCase();
    }
}