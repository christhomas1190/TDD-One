package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
         sb.reverse();
    return sb.toString();
    }
    
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for( int i = 0; i<str.length(); i++){
            if(str.charAt(i)==c) {
                count++;
            }

        }
        return count;
    }
    
    public static boolean isPalindrome(String str) {
        String minusPunc = str.replaceAll(",","" );
        String minusAll = minusPunc.replaceAll(":","");
        String paramMinusPunc=str.replaceAll(",","");
        String paramMinusAll= paramMinusPunc.replaceAll(" ","");
        StringBuilder sb = new StringBuilder(minusAll);
        StringBuilder reversed =sb.reverse();
        if(reversed.equals(str)){
//            System.out.println( str +" is a palindrome");
        }    return reversed.toString().toLowerCase().equals(paramMinusAll);

    }
}

