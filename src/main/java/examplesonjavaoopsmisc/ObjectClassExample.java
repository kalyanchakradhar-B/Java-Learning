package examplesonjavaoopsmisc;

public class ObjectClassExample {
    public static void main(String[] args){

        Object obj1 = new Object();
        Object obj2 = new Object();

        //equals() methods compare the object references
        System.out.println("Obj1 equals obj2:"+obj1.equals(obj2));//false

        //hashcode() methods returns the hashcode value
        System.out.println("Obj1 hashcode:"+obj1.hashCode());
        System.out.println("Obj2 hashcode:"+obj2.hashCode());

        //toString() method returns the string representation of the object
        System.out.println("Obj1 toString:"+obj1.toString());
        System.out.println("Obj2 toString:"+obj2.toString());

        //getClass() method returns the object class
        System.out.println("Obj1 class:"+obj1.getClass());
        System.out.println("Obj2 class:"+obj2.getClass());

    }
}
