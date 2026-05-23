package polymorphismexamplemethodoverloading;

public class Employee {
    public void generateSalary(int basic, float hike, int ta, float pf){
        double salary = basic+((basic*hike)/100)+ta-((basic*pf)/100);
        System.out.println("Salary       : "+salary);
    }
    public void generateSalary(int basic, float hike, int ta, float pf, int bonus){
        double salary = basic+((basic*hike)/100)+ta-((basic*pf)/100)+bonus;
        System.out.println("Salary       : "+salary);
    }
}

class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.generateSalary(30000, 29.0f, 4000, 11.5f);
        employee.generateSalary(40000, 30.0f, 4000, 11.5f, 100000);
    }
}
