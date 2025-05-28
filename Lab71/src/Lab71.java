import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab71 {
    public static String[] split(String s, String regex) {
        if (s == null || regex == null) {
            throw new IllegalArgumentException("Input strings must not be null.");
        }
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int lastEnd = 0;
        while (matcher.find()) {
            String substring = s.substring(lastEnd, matcher.start());
            if (!substring.isEmpty()) {
                result.add(substring);
            }
            result.add(matcher.group());
            lastEnd = matcher.end();
        }
        String remaining = s.substring(lastEnd);
        if (!remaining.isEmpty()) {
            result.add(remaining);
        }
        return result.toArray(new String[0]);
    }
}
