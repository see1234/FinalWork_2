package mc.see1.main.animals;

import mc.see1.main.Animal;

import java.util.List;

// Класс Домашнее Животное наследуется от Животное
public class HomeAnimal extends Animal {
    private String color;

    public HomeAnimal(String name, String birthDate, String say, String color, List<String> commands) {
        super(name, birthDate, say, commands);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
