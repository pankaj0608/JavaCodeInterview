package basic;

/**
 * Created by pankaj on 6/21/2015.
 */
public class CheckAllUnique {

    public static void main(String[] args) {

        String str = "abcc";
        char ch[] = new char[53];

        for(int i=0; i<str.length(); i++) {
            if(ch[str.charAt(i) - 'a'] == (str.charAt(i) - 'a' + 1)) {
                System.out.println("Non Unique");
                return;
            }
            else {
                ch[str.charAt(i) - 'a'] = (char)(str.charAt(i) - 'a' + 1);
            }
        }

        System.out.println("Unique");

    }
}
