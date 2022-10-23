package employee;

public class Employee {
    private int salary;
    private int workHoursPerDay;
    public Employee(int salary, int workHoursPerDay) {
        this.salary = salary;
        this.workHoursPerDay = workHoursPerDay;
    }
    public void getInfo() {
        System.out.println("Fizetes: " + salary + "Ft, Napi munkaideje: " + workHoursPerDay);
    }
    public void addSalary(int addAmount, int limit) {
        if (salary < limit) {
            salary += addAmount;
        }
    }

    public void addWork() {
        if (workHoursPerDay >= 6) {
            salary += 5;
        }
    }
}
