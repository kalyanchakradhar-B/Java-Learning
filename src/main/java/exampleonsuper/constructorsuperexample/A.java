package exampleonsuper.constructorsuperexample;

public class A {
    A(){
        System.out.println("A-con");
    }
    A(int i){
        System.out.println("A-param-con");
    }
}

class B extends A{
    B(){
        super(10);
        System.out.println("B-con");
    }
}

class Main{
    public static void main(String[] args){
        B b = new B();
    }
}