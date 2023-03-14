public class Employee {
    private static int idCounter = 0;
    private final int id;
    private final String Name;
    private int department;
    private double salary;
    public Employee(String Name, int department, int salary) {
        id = idCounter++;
        this.Name = Name;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return Name;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static Employee[] employees = new Employee[10];
    public static void showEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static Employee findMinSalary() {
       Employee minSalary=employees[0];
       for (Employee employee : employees) {
           if (employee.getSalary()<minSalary.getSalary()){
               minSalary=employee;
            }
        }
        return minSalary;
    }

    public static Employee findMaxSalary() {
        Employee maxSalary=employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary()>maxSalary.getSalary()){
                maxSalary=employee;
            }
        }
        return maxSalary;
    }

    public static double sumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum;

    }
    public static double averageSalary() {
        double sum=sumSalary();
        return sum/employees.length;
    }



    public static String[] printAllEmployeeNames() {

        String[] employeesAllName= new String[employees.length];
        for(int i=0;i<employees.length;i++) {
            employeesAllName[i] = employees[i].getName();
        }
        return employeesAllName;
    }
    public String toString() {
        return "Сотрудник №: " + id + ", Ф.И.О: " + Name + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}