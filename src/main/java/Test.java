import com.google.common.base.Splitter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tangjie on 16/5/14.
 */
public class Test
{
    public static void main(String[] args) {

        Splitter.onPattern("(?=\\d)").split("abc8").forEach(System.out::println);
        "asd".split("s");
        Pattern pattern = Pattern.compile("abc");

        String str = "abc abc abcabd";
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.end());
            System.out.println(str.substring(matcher.start(),matcher.end()));
        }

    }

}
