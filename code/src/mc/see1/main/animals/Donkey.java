package mc.see1.main.animals;

import java.util.List;

// Класс Осел наследуется от Вьючное Животное
public class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate, String say, String color, List<String> commands) {
        super(name, birthDate, say, color, commands);
    }
}
