import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.print("Enter name (or type 'exit' to stop): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age < 0) {
                System.out.println("Invalid age. Age cannot be negative.");
                continue;
            }

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            if (salary < 0) {
                System.out.println("Invalid salary. Salary cannot be negative.");
                continue;
            }

            Person person = new Person(name, age, salary);
            people.add(person);

            System.out.println("Information added.\n");
        }
    }
}