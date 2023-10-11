package lab072;

import java.util.List;

public class AnimalController {
    public static String result(List<Animal> animalList){
        String winner = "";
        int maxSpeed = animalList.get(0).getSpeed();
        for (Animal animal : animalList) {
            if (animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                winner = animal.getNameAnimal();
            }
        }
        return "The winner is: " + winner;
    }

}
