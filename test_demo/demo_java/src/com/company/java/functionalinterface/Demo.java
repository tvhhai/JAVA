package com.company.java.functionalinterface;

public class Demo {
    public static void main(String[] args) {

        // Create Greeting object:
        Greeting obj = new Greeting() {
            @Override
            public String greeting(String name) {
                return "Hi " + name;
            }
        };

        System.out.println(obj.greeting("Tran"));
        System.out.println(obj.hello("Tran"));
    }
}


@FunctionalInterface
interface Greeting {

    String greeting(String name);

    default String hello(String name) {
        return "Hello " + name;
    }
}
