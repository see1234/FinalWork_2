package mc.see1.main.animals;

import java.util.List;

// Класс Собака наследуется от Домашнее Животное
public class Dog extends HomeAnimal {
    public Dog(String name, String birthDate, String say, String color, List<String> commands) {
        super(name, birthDate, say, color, commands);
    }
}
