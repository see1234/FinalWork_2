package mc.see1.main;

import java.util.List;

public class Animal {
    private String name;
    private String birthDate;
    private String say;
    private List<String> commands;

    public Animal(String name, String birthDate, String say, List<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.say = say;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSay() {
        return say;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Дата рождения: %s;Голос: %s; Команды: %s", name,birthDate,say,commands.toString());
    }
}


