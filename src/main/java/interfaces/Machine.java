package interfaces;

import onjava.Operations;

class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}


class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}


class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/05/06 20:27
 */
public class Machine {
    public static void main(String[] args) {
        Operations.runOps(new Bing(), new Crack(), new Twist());
    }
}
