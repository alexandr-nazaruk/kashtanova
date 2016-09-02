package org.b14.test;

import java.util.LinkedList;
import java.util.List;

public class Main extends Parent {

    protected class InnerClass {
        String name = "InnerClass";

    }

    Object test() {
        return super.age;

    }

 //   @Override
    void hello() {
        System.out.println("I'm Main");
    }

    void testInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.name);
    }

    public static void main(String[] args) {
        System.out.println("hi there!");
        Parent main = new Main();
      //  System.out.println(main.test());
      //  main.testInner();
        main.hello();
    }

}

class Parent {
     int age;

    void hello(){
        System.out.println("I'm Parent");
    }

    Parent(){
        age=11;
    }
}