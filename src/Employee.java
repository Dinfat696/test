public class Employee {
    private static int idCounter = 0;
    private int id;
    private String Name;

    private int department;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + Name +
                ", Department: " + department + ", Salary: " + salary;
    }
}
