package stream;

/**
 * @Author ZhangGJ
 * @Date 2020/12/28 11:07
 */
public class Bubble {

    public final int i;

    public Bubble(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
