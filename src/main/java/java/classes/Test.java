package java.classes;

public class Test {
    public static void main(String[] args){

        //Abstract class
     //   A a = new A(); //error

        ExampleOnAbstarctClass exampleOnAbstarctClass = new B();
        exampleOnAbstarctClass.m1();
        exampleOnAbstarctClass.m2();
        exampleOnAbstarctClass.m3();

        //interface

        // ExampleOnInterface exampleOnInterface = new ExampleOnInterface(); //error

        ExampleOnInterface exampleOnInterface = new C();
        exampleOnInterface.m1();
        exampleOnInterface.m2();
    }
}
