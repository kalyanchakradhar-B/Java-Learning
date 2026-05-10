package java.classes;

public interface ExampleOnInterface {
    int x = 10;

    void m1();
    void m2();
}

class C implements ExampleOnInterface {
    @Override
    public void m1() {
        System.out.println("m1-i");
    }

    @Override
    public void m2() {
        System.out.println("m2-i");
    }
}
