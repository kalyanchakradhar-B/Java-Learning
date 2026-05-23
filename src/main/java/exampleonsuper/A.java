package exampleonsuper;

public class A {
    int i = 10;
    int j = 20;
}

class B extends A {
    int i = 100;
    int j = 200;

    B(int i, int j){
        System.out.println("local vars :"+i+" "+j);
        System.out.println("class level vars :"+this.i+" "+this.j);
        System.out.println("super class vars :"+super.i+" "+super.j);
    }
}

class main{
    public static  void main(String[] args){
        B b = new B(1000, 2000);

    }
}
