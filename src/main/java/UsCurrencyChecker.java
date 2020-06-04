import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        /**
         * \$ - matches a '$' character
         * \s? - matches a optional white space
         * \d+ - matches one or more digits
         * (?:\.\d{1,2})?
         *  - (?:) Non capturing group
         *  - \. matches a '.'
         *  - \d{1,2} - \d matches 0-9, {1-2} is a quantifier that matches between 1 or 2 of the preceding token
         *  - ? - optional (0 or 1)
         */
        String pattern = "\\$\\s?\\d+(?:\\.\\d{1,2})?";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        return r.matcher(usCurrencyString);
    }
}
