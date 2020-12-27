package functional;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * @Author ZhangGJ
 * @Date 2020/12/27 20:57
 */
public class FunctionWithWrapped {

    public static void main(String[] args) {
        Function<Integer, Double> fid = i -> (double) i;
        IntToDoubleFunction fid2 = i -> i;
    }
}
