package innerclasses;

/**
 * @Author ZhangGJ
 * @Date 2020/05/07 19:37
 */
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
