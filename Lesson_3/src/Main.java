public class Main {
    public static void main(String[] args) {
        // Задание 1: часть 1
        System.out.println("Задание 1: Часть 1");

        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        dogBobik.run(400);
        dogBobik.swim(10);
        catMurzik.run(150);
        catMurzik.swim(5);

        System.out.println("Создано животных: " + Animal.getCount());
        System.out.println("Создано собак: " + Dog.getCount());
        System.out.println("Создано котов: " + Cat.getCount());

        // Задание 1: часть 2
        System.out.println("\nЗадание 1: Часть 2");

        Bowl bowl = new Bowl(20);
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Васька"),
                new Cat("Мурка"),
                new Cat("Пушок"),
                new Cat("Снежок")
        };

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "да" : "нет"));
        }

        bowl.addFood(10);
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "да" : "нет"));
        }

        // Задание 2
        System.out.println("\nЗадание 2:");

        Shape circle = new Circle(5, "Red", "Blue");
        Shape rectangle = new Rectangle(4, 6, "Green", "Yellow");
        Shape triangle = new Triangle(3, 4, 5, "Purple", "Black");

        circle.printDetails();
        rectangle.printDetails();
        triangle.printDetails();
    }
}

// Задание 1
class Animal {
    private static int count = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}

class Dog extends Animal {
    private static int count = 0;
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

class Cat extends Animal {
    private static int count = 0;
    private static final int RUN_LIMIT = 200;
    private boolean full;

    public Cat(String name) {
        super(name);
        count++;
        this.full = false;
    }

    public static int getCount() {
        return count;
    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= 5) {
            bowl.decreaseFood(5);
            full = true;
        }
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
}

// Задание 2
interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    default void printDetails() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
