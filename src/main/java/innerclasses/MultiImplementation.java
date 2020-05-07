package innerclasses;

class D {
}


abstract class E {
}


class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/07 20:10
 */
public class MultiImplementation {
    static void takesD(D d) {
    }

    static void takesE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
