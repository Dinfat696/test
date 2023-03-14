public class Main {


    public static void main(String[] args) {

        Employee.employees[0] = new Employee("Иванов Иван Иванович1", 1, 10000);
        Employee.employees[1] = new Employee("Иванов Иван Иванович2", 1, 20000);
        Employee.employees[2] = new Employee("Иванов Иван Иванович3", 2, 30000);
        Employee.employees[3] = new Employee("Иванов Иван Иванович4", 2, 40000);
        Employee.employees[4] = new Employee("Иванов Иван Иванович5", 3, 50000);
        Employee.employees[5] = new Employee("Иванов Иван Иванович6", 3, 60000);
        Employee.employees[6] = new Employee("Иванов Иван Иванович7", 4, 70000);
        Employee.employees[7] = new Employee("Иванов Иван Иванович8", 4, 80000);
        Employee.employees[8] = new Employee("Иванов Иван Иванович9", 5, 90000);
        Employee.employees[9] = new Employee("Иванов Иван Иванович10", 5, 100000);
        System.out.println();
        Employee.showEmployees();


        double sumSalary = Employee.sumSalary();// Сумма затрат на зарплаты в месяц
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);


        Employee minSalaryEmployee = Employee.findMinSalary();// Сотрудник с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);


        Employee maxSalaryEmployee = Employee.findMaxSalary();// Сотрудник с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);


        double averageSalary = Employee.averageSalary();// Среднее значение зарплат
        System.out.println("Среднее значение зарплат: " + averageSalary);


        // Ф. И. О. всех сотрудников
        String[] employeesFullNames = Employee.printAllEmployeeNames();
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (String fullName : employeesFullNames) {
            System.out.println(fullName);


        }
    }
}