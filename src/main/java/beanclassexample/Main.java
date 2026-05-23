package beanclassexample;

public class Main {

    public static void main(String[] args){
        User user = new User();

        user.setUname("Java Learning");
        user.setUpassword("JavaTop");

        System.out.println("User name:" +user.getUname());
        System.out.println("User password:" +user.getUpassword());
    }
}
