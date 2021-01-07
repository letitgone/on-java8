package annotation;

/**
 * @Author ZhangGJ
 * @Date 2021/01/05 11:31
 */
public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }
    @Test
    void testExecute() { execute(); }
}
