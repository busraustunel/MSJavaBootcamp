package Java02.godoro.inheritance;

public class Employee extends Person {
    private int employeeId;
    private double monthlySalary;

    public Employee(int personId, String personFirstName, String personLastName, int employeeId, double monthlySalary) {
        super(personId, personFirstName, personLastName);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    public void sendMail(Employee employee) {
        System.out.println();
        System.out.println("Kime : " + employee.getFullName(employee.getPersonFirstName(), employee.getPersonLastName()));
        System.out.println("Konu : " + employee.getMonthlySalary() + " olan maaşınızın arttırılması hk.");
    }
}

