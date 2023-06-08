package mc.see1.main.animals;

import java.util.List;

// Класс Кошка наследуется от Домашнее Животное
public  class Cat extends HomeAnimal {
    public Cat(String name, String birthDate, String say, String color, List<String> commands) {
        super(name, birthDate, say, color, commands);
    }
}
