package functional;

class X {
    String f() {
        return "X::f()";
    }
}


interface MakeString {
    String make();
}


interface TransformX {
    String transform(X x);
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/08 16:48
 */
public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // Same effect
    }
}
