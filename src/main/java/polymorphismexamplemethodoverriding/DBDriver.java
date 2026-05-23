package polymorphismexamplemethodoverriding;

public class DBDriver {
    public void getDriver(){
        System.out.println("Type-1 Driver");
    }
}

class NewDBDriver extends DBDriver {
    public void getDriver(){
        System.out.println("Type-4 Driver");
    }
}
class Main {
    public static void main(String[] args) {
       DBDriver odriver = new DBDriver();
       odriver.getDriver(); //type 1 driver


      NewDBDriver ddriver = new NewDBDriver();
       ddriver.getDriver();

        DBDriver driver = new NewDBDriver();
        driver.getDriver();
    }
}

