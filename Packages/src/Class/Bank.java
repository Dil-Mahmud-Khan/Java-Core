package Class;

import Interface.CustomerOperations;
import Interface.EmployeeOperations;

public class Bank implements CustomerOperations, EmployeeOperations {
    private final Customer[] customer =new Customer[500];
    private final Employee[] employee =new Employee[100];

    public void insertCustomer(Customer c){
        int flag=0;
        for(int i=0;i<customer.length;i++){
            if(customer[i]==null){
                customer[i]=c;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Customer Inserted");
        }
        else{
            System.out.println("Customer can not be inserted");
        }
    }

    public void removeCustomer(Customer c){
        int flag=0;
        for(int i=0;i< customer.length;i++){
            if(customer[i]==c){
                customer[i]=null;
                flag=1;
                break;

            }
        }
        if(flag==1){
            System.out.println("Customer Removed");
        }
        else{
            System.out.println("Customer can not be removed");
        }
    }

    public Customer getCustomer(int nid){
        Customer c=null;
        for(int i=0;i< customer.length;i++){
            if(customer[i]!=null){
                if(customer[i].getNid()==nid){
                    c=customer[i];
                    break;
                }
            }
        }
        return c;

    }
    public void insertEmployee(Employee e) {
        int flag = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = e;
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Employee inserted");
        }
        else{
            System.out.println("Employee can not be inserted");
        }
    }

    public void removeEmployee(Employee e){
        int flag=0;
        for(int i=0;i<employee.length;i++){
            if(employee[i]!=e){
                employee[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Employee Removed");
        }
    }
    public Employee getEmployee(String empId ){
        Employee e=null;
        for(int i=0;i<employee.length;i++){
            if(employee[i]==null){
                assert employee[i] != null;
                if(employee[i].getEmpId().equals(empId)){
                    e=employee[i];
                    break;

                }
            }
        }
        return e;
    }

    public void showAllEmployee(){
        System.out.println("----------");
        for(Employee e:employee){
            if(e!=null){
                System.out.println("Employee Name:"+e.getName());
                System.out.println("Employee Id:"+e.getEmpId());
                System.out.println("Salary:"+e.getSalary());
                System.out.println();
            }
        }
    }

    public void showAllCustomer(){
        System.out.println("------------");
        for(Customer c:customer){
            if(c!=null){
                System.out.println("Employee Name:"+c.getName());
                System.out.println("Employee Name:"+c.getNid());
                c.showAllAccount();
            }
        }
    }

}
