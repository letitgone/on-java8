package stream;

import java.util.stream.Stream;

/**
 * @Author ZhangGJ
 * @Date 2020/12/28 11:07
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3)).forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!").forEach(System.out::print);
        System.out.println();
        Stream.of(3.14159, 2.718, 1.618).forEach(System.out::println);
    }
}
