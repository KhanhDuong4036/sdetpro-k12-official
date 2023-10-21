package lab09;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static lab09.Animal.Builder;
import static lab09.AnimalController.result;

public class TestAnimalController {
    public static void main(String[] args) {
        Builder animalBuilder = new Builder();
        Animal falcon = animalBuilder
                .setName("Falcon")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true)
                .build();
        Animal tiger = animalBuilder
                .setName("Tiger")
                .setSpeed(new SecureRandom().nextInt(80))
                .setFlyable(false)
                .build();
        Animal horse = animalBuilder
                .setName("Horse")
                .setSpeed(new SecureRandom().nextInt(70))
                .setFlyable(false)
                .build();
        List<Animal> animalList = Arrays.asList(falcon, tiger, horse);
//        System.out.println(animalList);
        System.out.println(result(animalList));
    }
}
