package onjava;

/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:26
 */
public interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for (Operations op : ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
