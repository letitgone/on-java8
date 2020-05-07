package interfaces.interfaceprocessor;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 22:58
 */
public class Applicator {
    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
