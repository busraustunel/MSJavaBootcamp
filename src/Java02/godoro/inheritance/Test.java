package Java02.godoro.inheritance;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Edip","Akbayram",401,9.5);
        System.out.println("Person id: " + employee.getPersonId() + "\n" +
                "Ad : " + employee.getFullName(employee.personFirstName, employee.personLastName) + "\n" +
                "Employee id: " + employee.getEmployeeId() + "\n" +
                "Maaş : " + employee.getMonthlySalary());

        employee.sendMail(employee);


    }
}
