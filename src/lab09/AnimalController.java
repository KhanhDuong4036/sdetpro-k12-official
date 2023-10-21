package lab09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public static String result(List<Animal> animalList){
        List<Animal> animalWithFly = new ArrayList<>();
        for (Animal animal : animalList) {
            if(animal.isFlyable());
            animalWithFly.add(animal);
        }
        System.out.println(animalWithFly);

        String winner = "";
        int maxSpeed = animalList.get(0).getSpeed();
        for (Animal animal : animalWithFly) {
            if(animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return "The winner is: " + winner;
    }


}
