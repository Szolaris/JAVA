package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee dolgozo1 = new Employee(490, 20, 31);
        Employee dolgozo2 = new Employee(900, 4,50);
        dolgozo1.setEmployeeId(568854);
        dolgozo1.addSalary(10, 500);
        dolgozo1.addSalary(200, 600);
        dolgozo1.addWork();
        dolgozo1.getInfo();
        dolgozo2.setEmployeeId(34526);
        dolgozo2.setUserId(44);
        dolgozo2.addSalary(10, 500);
        dolgozo2.addSalary(200, 600);
        dolgozo2.addWork();
        dolgozo2.getInfo();






    }



}
