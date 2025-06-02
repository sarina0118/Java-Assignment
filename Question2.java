class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public void getSalary() {
        System.out.println("Employee salary is credited.");
    }
}

class HRManager extends Employee {
    // Overriding the work() method
    @Override
    public void work() {
        System.out.println("HR Manager is managing hiring processes.");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.getSalary();
        HRManager hr = new HRManager();
        hr.work();         // Overridden method
        hr.getSalary();    // Inherited method
    }
}


       

