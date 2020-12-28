package functional;

import java.util.function.Function;

interface FuncSS extends Function<String, String> {
} // [1]


/**
 * @Author ZhangGJ
 * @Date 2020/12/28 10:44
 */
public class ProduceFunction {

    static FuncSS produce() {
        return s -> s.toLowerCase(); // [2]
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }
}

