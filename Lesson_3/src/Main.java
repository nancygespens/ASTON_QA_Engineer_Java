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
