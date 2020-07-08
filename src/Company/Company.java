package Company;

import Employee.Employee;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private static List<Employee> employees = new ArrayList<>();

    public static void generate() {

        while (employees.size() < 10)
            employees.add(
                            new Employee(new Faker().name().fullName(),
                            (float) new Faker().number().randomDouble(1, 10000, 20000),
                            (float) new Faker().number().randomDouble(1, 3, 15))
            );

    }


    public static void printAllCompact() {
        System.out.println("All Compact\n");
        employees.forEach(names -> System.out.println(names.getFullName()));


    }

    public static void printAllDetailed() {
        System.out.println("All Detailed\n");
        employees.forEach(System.out::println);
    }
}
