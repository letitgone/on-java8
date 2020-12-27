package functional;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}


/**
 * @Author ZhangGJ
 * @Date 2020/12/27 16:15
 */
public class TriFunctionTest {

    static int f(int i, long l, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf = TriFunctionTest::f;
        tf = (i, l, d) -> 12;
    }
}
