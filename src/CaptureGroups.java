import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {

        String regex = """
                (?:(?<countryCode>\\d{1,2})[-,.\\s]?)?
                (?:\\(?(?<areaCode>\\d{3})\\)?[-,.\\s]?)
                (?:(?<exchange>\\d{3})[-,.\\s]?)
                (?<lineNumber>\\d{4})
                """;
        String phoneNumber = "1 (267) 435 9375";
        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher mat = pat.matcher(phoneNumber);
        if (mat.matches()) {
            System.out.println(mat.group("countryCode"));
            System.out.println(mat.group("areaCode"));
            System.out.println(mat.group("exchange"));
            System.out.println(mat.group("lineNumber"));

        }
    }
}
