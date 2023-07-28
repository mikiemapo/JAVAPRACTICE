package inheritance;

class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.name = "Patso";
        p.greeting();

        Child c = new Child();
        c.name = "Chris";
        c.greeting();

    }
}
