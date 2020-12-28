package functional;

import java.util.function.Function;

class I {
    @Override
    public String toString() {
        return "I";
    }
}


class O {
    @Override
    public String toString() {
        return "O";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/12/28 10:46
 */
public class TransformFunction {

    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I, O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });
        O o = f2.apply(new I());
    }
}
