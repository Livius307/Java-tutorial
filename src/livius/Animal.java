package livius;

public abstract class Animal {
    public String picture;
    protected String name;
    private int age;
    public static int numberOfAnimals = 0;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
        numberOfAnimals++;
    }
    public abstract void move();

    public void makeSound() {
        System.out.println("Whatever Sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Picture: " + picture);
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
        System.out.println(name + " turned " + age + " years old today!");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
