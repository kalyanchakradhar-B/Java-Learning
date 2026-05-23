package exampleonsuper.supermethodexample;

public class A {
    void m1(){
        System.out.println("m1-A");
    }
}

class B extends A{
    void m2(){
        System.out.println("m2-B");
        m1();
        this.m1();
        super.m1();
    }
    void m1(){
        System.out.println("m1-B");
    }
}

class Main{
    public static void main(String[] args){
        B b = new B();
        b.m2();
    }
}