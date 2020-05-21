package src;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    public String camelcase(String sentence) {

        String[] ar = sentence.split(" ");
        String result="";
        for (int i = 0; i < ar.length; i++) {
            String first = ar[i].substring(0, 1);
            String second=ar[i].substring(1);
            result+=first.toUpperCase()+second+ " ";

        }


        return result.trim();
    }


}
