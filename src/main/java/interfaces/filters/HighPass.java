package interfaces.filters;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:50
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
