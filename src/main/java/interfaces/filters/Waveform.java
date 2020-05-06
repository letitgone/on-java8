package interfaces.filters;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:50
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}

