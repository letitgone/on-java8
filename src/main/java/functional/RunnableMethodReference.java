package functional;

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/08 16:30
 */
public class RunnableMethodReference {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }
}
