package mc.see1.main.animals;

import java.util.List;

// Класс Верблюд наследуется от Вьючное Животное
public class Camel extends PackAnimal {
    public Camel(String name, String birthDate, String say, String color, List<String> commands) {
        super(name, birthDate, say, color,commands);
    }
}
