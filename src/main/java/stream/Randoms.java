package stream;

import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2020/12/28 11:04
 */
public class Randoms {

    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
