package interfaces.interfaceprocessor;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 22:58
 */
public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}
