package functional;

import java.util.function.Function;

class One {
}


class Two {
}


/**
 * @Author ZhangGJ
 * @Date 2020/12/28 10:45
 */
public class ConsumeFunction {

    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}
