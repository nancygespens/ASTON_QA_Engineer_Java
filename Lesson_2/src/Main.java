import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1:");

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Бобр Василиса Патрикеевна", "Программист ", "bobrCurva@mailbox.com", "892312313", 35000, 35);
        employees[2] = new Employee("Хрюн Фёкла Евлампиевна", "Бухгалтер", "fyok@mailbox.com", "892312314", 40000, 28);
        employees[3] = new Employee("Жужа Степановн Владимировна", "Учитель", "panPropal@mailbox.com", "892312315", 32000, 40);
        employees[4] = new Employee("Гоша Мстислав Игоревич", "Врач", "misfits@mailbox.com", "892312316", 38000, 45);

        for (Employee employee : employees) {
            employee.printInfo();
        }

        // Задание 2
        System.out.println("\nЗадание 2:");

        Park park = new Park();
        park.addAttraction("Американские горки", "10:00 - 18:00", 500);
        park.addAttraction("Колесо обозрения", "09:00 - 20:00", 300);
        park.addAttraction("Дом с привидениями", "11:00 - 22:00", 400);

        park.printAttractions();
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}

class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String hours, int price) {
        attractions.add(new Attraction(name, hours, price));
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }

    class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println();
        }
    }
}
