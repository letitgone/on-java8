package innerclasses.mui;

interface A {
}


interface B {
}


class X implements A, B {
}


class Y implements A {
    B makeB() {
        // Anonymous inner class:
        return new B() {
        };
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/07 20:06
 */
public class MultiInterfaces {
    static void takesA(A a) {
    }

    static void takesB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
