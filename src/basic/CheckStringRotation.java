package basic;

/**
 * Created by pankaj on 6/21/2015.
 */
public class CheckStringRotation {

    public static void main(String[] args) {

        String str1 = "waterbottle";
        String str2 = "erbottlewa";

        System.out.println(isSubString(str1, str2));
        /*Just do the following checks
        1  Check if length(s1) == length(s2)  If not, return false
        2  Else, concatenate s1 with itself and see whether s2 is substring of the result
        input: s1 = apple, s2 = pleap ==> apple is a substring of pleappleap
        input: s1 = apple, s2 = ppale ==> apple is not a substring of ppaleppale
        */

    }

    private static boolean isSubString(String str1, String str2) {

        if((str1+str1).indexOf(str2) != -1 ) {
            return true;
        }

        return false;
    }
}
