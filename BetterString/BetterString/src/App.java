import java.util.function.BiPredicate;

public class App {
    public static String betterString(String s1, String s2, BiPredicate<String,String> criteria){
        if(criteria.test(s1, s2))
            return s1;
        else
            return s2;
    }
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println(betterString("testaaa", "test2", (s1,s2)-> s1.length() > s2.length()));
    }
}
