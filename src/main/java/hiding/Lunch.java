package hiding;

class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() { // [1]
        return new Soup1();
    }
}


class Soup2 {
    private Soup2() {
    }

    private static Soup2 ps1 = new Soup2(); // [2]

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
    }
}


/**
 * Only one public class allowed per file:
 *
 * @Author ZhangGJ
 * @Date 2020/04/29 21:29
 */
public class Lunch {
    void testPrivate() {
        // Can't do this! Private constructor:
        //- Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
