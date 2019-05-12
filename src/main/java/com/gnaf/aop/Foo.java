package com.gnaf.aop;

/**
 * @author Derek
 * @date 2019/5/12 9:02
 */
public class Foo {

    public void action1() {
        System.out.println("action1");
    }

    public int action2() {
        System.out.println("action2");
        return 1;
    }

    public Integer action3() {
        System.out.println("action3");
        return -1;
    }

    public void action4(Integer num) {
        System.out.println("action4: " + num);
    }

    public Foo action5() {
        Foo foo = new Foo();
        System.out.println("action5");
        return foo;
    }

}
