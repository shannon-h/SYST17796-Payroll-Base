/**
 * Filename: EmployeeFactory.java
 * Description: Defines a singleton factory for creating 
 * objects of type Employee and Manager while hiding the implementation
 * @author Shannon Han
 * Date Created: Aug 4th, 2020
 */
package payroll;

public class EmployeeFactory {
    
    private static EmployeeFactory instance;
    
    private EmployeeFactory() { }
    
    public static EmployeeFactory getInstance() {
        if (instance == null){
            instance = new EmployeeFactory();
        }
        return instance;
    }
    
    public Employee createEmployee(EmployeeType type, String name, 
                                    double hours, double wage) {
        switch (type) {
            case EMPLOYEE:
                return new Employee(name, hours, wage);
            case MANAGER_WITH_BONUS:
                return new Manager(name);
            case MANAGER_NO_BONUS:
                return new Manager(name, hours, wage);
        }
        return null;
    }  
}
