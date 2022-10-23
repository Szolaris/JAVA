package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee dolgozo = new Employee(490, 6);
        dolgozo.addSalary(10, 500);
        dolgozo.addSalary(200, 600);
        dolgozo.addWork();
        dolgozo.getInfo();
    }
}
