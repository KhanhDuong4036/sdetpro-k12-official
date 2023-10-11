package lab072;

import java.util.Arrays;
import java.util.List;

import static lab072.AnimalController.result;

public class TestAnimalController {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");
        List<Animal> listAnimal = Arrays.asList(dog,horse,tiger);
        System.out.println(listAnimal);
        System.out.println(result(listAnimal));

    }
}
