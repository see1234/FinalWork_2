package mc.see1.main.animals;

import java.util.List;


public class Horse extends PackAnimal {
    private int speed;

    public Horse(String name, String birthDate, String say, int speed, List<String> commands) {
        super(name, birthDate, say, "null", commands);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
