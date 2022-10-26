package employee;

public class Employee {
    private int salary;
    private int workHoursPerDay;
    private int employeeId;
    private int userId = 33;


    public void setUserId(int userId) {
        this.userId = userId;
    }


    public int getUserId() {
        return userId;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Employee(int salarrrrry, int workHoursPerDay, int userID ) {
        this.userId = userID;
        this.salary = salarrrrry;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void getInfo() {
        System.out.println("userId =" + getUserId() + "   emloyeeId = " + this.employeeId + "    Fizetes: " + salary + "Ft, Napi munkaideje: " + workHoursPerDay);
    }
    public void addSalary(int addAmount, int limit) {
        if (salary < limit) {
            salary += addAmount;
        }
    }

    public void addWork() {
        if (workHoursPerDay >= 6) {
            for (int i = 0; i < workHoursPerDay-5; i++) {
                salary += 5;
            }
        }
    }
}
