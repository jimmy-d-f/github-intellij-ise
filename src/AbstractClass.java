public class AbstractClass {
    public static void main(String[] args){
        MANAGER mn = new MANAGER("Bobby", 3800.00);
        Developer dv = new Developer("Jimmy", 3800.00);

        mn.displayInfo();
        dv.displayInfo();

        System.out.println("The annual bonus is: " + mn.calculateAnnualBonus() + " euros.");
        System.out.println("The annual bonus is: " + dv.calculateAnnualBonus() + " euros.");
    }
}

abstract class EMPLOYEE{
    protected String name;
    protected double monthlySalary;

    private EMPLOYEE(){}

    EMPLOYEE(String name, double monthlySalary){
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract void displayInfo();
    public abstract double calculateAnnualBonus();
}

class MANAGER extends EMPLOYEE{
    MANAGER(String name, double monthlySalary){
        super(name, monthlySalary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    @Override
    public double calculateAnnualBonus() {
        return ((monthlySalary * 12) / 5);
    }
}

class Developer extends EMPLOYEE{
    Developer(String name, double monthlySalary){
        super(name, monthlySalary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    @Override
    public double calculateAnnualBonus() {
        return (((monthlySalary * 12) / 10) + 1000);
    }
}