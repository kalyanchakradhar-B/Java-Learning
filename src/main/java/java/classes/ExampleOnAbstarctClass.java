package java.classes;

abstract class ExampleOnAbstarctClass {
    void m1(){
        System.out.print("m1-A");
    }
    abstract void m2();
    abstract void m3();
}
class B extends ExampleOnAbstarctClass {
    void m2(){
        System.out.print("m2-A");
    }

    void m3(){
        System.out.print("m3-A");
    }
}
