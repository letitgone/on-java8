package functional;

import java.util.function.IntSupplier;

/**
 * @Author ZhangGJ
 * @Date 2020/12/28 10:52
 */
public class Closure2 {

    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }
}
