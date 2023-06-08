package mc.see1.main;



import mc.see1.main.animals.HomeAnimal;
import mc.see1.main.animals.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry implements AutoCloseable {
    private List<Animal> animals;
    private int counter;

    public AnimalRegistry() {
        animals = new ArrayList<Animal>();
        counter = 0;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        counter++;
    }
    public void add() {//Не нужен так как сделан addAnimal
        counter++;
    }
    public void listCommands(Animal animal) {
        System.out.println("Команды для животного:");
        for (String command : animal.getCommands()) {
            System.out.println("- " + command);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void teachAnimal(Animal animal, String command) {
        if (animal instanceof HomeAnimal) {
            System.out.println("Обучаем домашнее животное команде: " + command);
            animal.getCommands().add(command);
        } else if (animal instanceof PackAnimal) {
            System.out.println("Обучаем вьючное животное команде: " + command);
            animal.getCommands().add(command);
        } else {
            System.out.println("Неизвестное животное.");
        }
    }

    public Animal getAnimalOfName(String name) throws Exception {
        for(Animal animal : animals) {
            if(animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        throw new Exception("Животное не найдено");
    }

    @Override
    public void close() throws Exception {
        if (counter > 0) {
            throw new Exception("Работа с реестром не завершена.");
        }
    }
}