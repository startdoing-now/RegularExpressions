import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {
    public static void main(String[] args) {
        String people = """
                tran, you, 13/08/2003
                le, dung, 14/04/2003
                anh, em, 12/12/2022
                ban, minh, 08/08/2020
                """;

        String regex = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<dob>\\d{2}/\\d{2}/\\d{4})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);
        mat.find();
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("dob"));
    }
}
