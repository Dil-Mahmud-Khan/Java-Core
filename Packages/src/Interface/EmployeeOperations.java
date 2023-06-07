package Interface;
import Class.Employee;
public interface EmployeeOperations {
    void insertEmployee(Employee e);
    void removeEmployee(Employee e);
    Employee getEmployee(String empId);
    void showAllEmployee();
}
