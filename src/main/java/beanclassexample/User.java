package beanclassexample;

public class User {

    private String Uname;
    private String Upassword;

    //setter methods

    public void setUname(String userName){
        Uname = userName;
    }

    public void setUpassword(String userPassword){
        Upassword = userPassword;
    }

    // getter methods

    public String getUname(){
        return Uname;
    }

    public String getUpassword(){
        return Upassword;
    }


}
