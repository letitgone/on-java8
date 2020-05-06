package interfaces.filters;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:50
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }
}
