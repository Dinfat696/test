public class Main {
    public static Employee findMinSalary(Employee[] list) {
        int index = 0;
        int min = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() < min) {
                min = list[i].getSalary();
                index = i;
            }
        }
        return list[index];
    }

    public static Employee findMaxSalary(Employee[] list) {
        int index = 0;
        int min = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() > min) {
                min = list[i].getSalary();
                index = i;
            }
        }
        return list[index];
    }

    public static int sumSalary(Employee[] list) {
        int sum = 0;
        for (Employee employee : list) {
            sum += employee.getSalary();
        }

        return sum;

    }

    public static int averageSalary(Employee[] list) {
        int average = 0;
        for (Employee employee : list) {
            average += employee.getSalary() / 10;
        }

        return average;
    }


    public static void showEmployees(Employee[] list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    public  static void printAllEmployeeNames(Employee[] list) {
        for (Employee employee : list) {
            System.out.println(employee.getName());
            }
        }




    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович1", 1, 10000);
        employee[1] = new Employee("Иванов Иван Иванович2", 1, 20000);
        employee[2] = new Employee("Иванов Иван Иванович3", 2, 30000);
        employee[3] = new Employee("Иванов Иван Иванович4", 2, 40000);
        employee[4] = new Employee("Иванов Иван Иванович5", 3, 50000);
        employee[5] = new Employee("Иванов Иван Иванович6", 3, 60000);
        employee[6] = new Employee("Иванов Иван Иванович7", 4, 70000);
        employee[7] = new Employee("Иванов Иван Иванович8", 4, 80000);
        employee[8] = new Employee("Иванов Иван Иванович9", 5, 90000);
        employee[9] = new Employee("Иванов Иван Иванович10", 5, 100000);
        showEmployees(employee);
        printAllEmployeeNames(employee);
        System.out.println("Cумма затрат на зарплаты в месяц: " + sumSalary(employee));
        System.out.println("Cотрудник с минимальной зарплатой: " + findMinSalary(employee));
        System.out.println("Cотрудник с максимальной зарплатой: " + findMaxSalary(employee));
        System.out.println("Среднее значение зарплаты: " + averageSalary(employee));





    }
}

