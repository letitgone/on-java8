package innerclasses;

class MNA {
    private void f() {
    }

    class A {
        private void g() {
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/07 20:01
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}

