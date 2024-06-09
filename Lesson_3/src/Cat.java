public class Cat extends Animal {
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
