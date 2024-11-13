import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exempl {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eiri344", "iretuor232", "dggs", "ertgre", "234");

        System.out.println(metod(list));
    }


    public static List<String> metod(List<String> list) {
        List<String> list1 = list.stream().filter(x -> x.matches(".*\\d.*")).collect(Collectors.toList());
        List<String> integ = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {

            Pattern pattern = Pattern.compile(("\\d+"));
            Matcher matcher = pattern.matcher(list1.get(i));
            while (matcher.find()) {
                //System.out.println(matcher.group());
                integ.add(matcher.group());
            }
        }
        return integ;
    }
}



