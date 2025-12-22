package livius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal bengie = new Dog("bengie.png", "Bengie", 9 );
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7 );
        Animal whiskers = new Cat("whiskers.png", "Whiskers", 5);
        Bird cheepy = new Bird("cheepy.png", "Cheepy", 6);
        cheepy.move();

        List<Animal> animals = new ArrayList<>();
        animals.add(jeremy);
        animals.add(whiskers);
        animals.add(cheepy);

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(cheepy);
        flyables.add(new Aeroplane());

        for (Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }
        for (IFlyable flyable : flyables) {
            flyable.fly();
        }
    }
}