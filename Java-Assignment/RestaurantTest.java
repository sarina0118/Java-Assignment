//You are developing a restaurant management system that handles different types of employees, such as chefs and waiters. Design an interface named "Employee" with the following methods:
//work(): This method should define the work responsibilities of the employee.
//getSalary(): This method should return the salary of the employee.

// Interface for all employees
interface Employee {
    void work();              // Defines work responsibilities
    double getSalary();       // Returns salary of the employee
}

// Chef class implementing Employee
class Chef implements Employee {
    private double salary;

    public Chef(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Chef is cooking delicious meals.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Waiter class implementing Employee
class Waiter implements Employee {
    private double salary;

    public Waiter(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Waiter is serving customers and taking orders.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Main class to test the system
public class RestaurantTest {
    public static void main(String[] args) {
        Employee chef = new Chef(50000);
        Employee waiter = new Waiter(30000);

        System.out.println("=== Chef ===");
        chef.work();
        System.out.println("Chef Salary: $" + chef.getSalary());

        System.out.println("\n=== Waiter ===");
        waiter.work();
        System.out.println("Waiter Salary: $" + waiter.getSalary());
    }
}

