import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {

        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82222256576
                Cumulative GPA (Unweighted)	3.463454654
                """;
        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).*
                Grade:\\s+(?<grade>\\d{2}).*
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDate>\\d{2})/(?<birthYear>\\d{4}).*
                Gender:\\s(?<gender>\\w)\\b.*
                State\\sID:\\s+(?<stateId>\\d{10})\\b.*
                \\)\\s+(?<weighted>[\\d.]+)\\b.*
                \\)\\s+(?<unWeighted>[\\d.]+)\\b.*
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL|Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);
        if(mat.matches()) {
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDate"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("weighted"));
            System.out.println(mat.group("unWeighted"));
        }
    }
}
