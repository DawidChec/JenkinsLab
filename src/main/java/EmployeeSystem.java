import java.util.ArrayList;

public class EmployeeSystem {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public ArrayList<Employee> getEmployeeList() {
        return employees;
    }

    public void addEmployee(Employee testObject) {
        employees.add(testObject);
    }

    public void removeEmloyee(Employee testObject) {
        employees.remove(testObject);
    }


}
