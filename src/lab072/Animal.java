package lab072;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String nameAnimal;

    public Animal() {
    }

    public Animal(int speed, String nameAnimal) {
        this.speed = new SecureRandom().nextInt(speed);
        this.nameAnimal = nameAnimal;
    }

    public int getSpeed() {
        return speed;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public String toString(){
        return "Animal{" +
                "name='" + nameAnimal + '\'' +
                ", speed=" + speed +
                '}';
    }

}
