package MethodOveRiding;

public class Child extends Parent {
    int age;

    @Override
    public void greeting() {
        System.out.println("Hello, I am a child." + name + " iam " + age);
    }

}
