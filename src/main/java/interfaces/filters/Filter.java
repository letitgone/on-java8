package interfaces.filters;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:50
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
