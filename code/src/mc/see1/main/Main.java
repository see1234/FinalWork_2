package mc.see1.main;

import mc.see1.main.animals.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (AnimalRegistry registry = new AnimalRegistry()) {
            Cat test_cat = new Cat("Мурзик", "01-01-2022", "Мяу", "Черный", new ArrayList<String>());
            Dog test_dog = new Dog("Бобик", "02-02-2022", "Гав", "Рыжий", new ArrayList<String>());
            Horse test_horse = new Horse("Буцефал", "03-03-2022", "Иго-го", 30, new ArrayList<String>());
            registry.addAnimal(test_cat);
            registry.addAnimal(test_dog);
            registry.addAnimal(test_horse);
            registry.teachAnimal(test_cat, "Спать");
            registry.teachAnimal(test_dog, "Лежать");
            registry.teachAnimal(test_horse, "Стоять");
            Scanner scanner = new Scanner(System.in);
            int choice = -1;
            help();
            while(choice != 0) {

                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.print("Введите тип животного (cat/dog/horse/camel/donkey/hamster): ");
                            String animalType = scanner.nextLine();

                            System.out.print("Введите имя животного: ");
                            String name = scanner.nextLine();

                            System.out.print("Введите дату рождения животного: ");
                            String birthDate = scanner.nextLine();

                            System.out.print("Введите звук, который издает животное: ");
                            String say = scanner.nextLine();

                            if (animalType.equals("cat")) {
                                System.out.print("Введите цвет кошки: ");
                                String color = scanner.nextLine();
                                Cat cat = new Cat(name, birthDate, say, color, new ArrayList<String>());
                                registry.addAnimal(cat);
                            } else if (animalType.equals("dog")) {
                                System.out.print("Введите цвет собаки: ");
                                String color = scanner.nextLine();
                                Dog dog = new Dog(name, birthDate, say, color, new ArrayList<String>());
                                registry.addAnimal(dog);
                            } else if (animalType.equals("horse")) {
                                System.out.print("Введите скорость лошади: ");
                                int speed = scanner.nextInt();
                                Horse horse = new Horse(name, birthDate, say, speed, new ArrayList<String>());
                                registry.addAnimal(horse);
                            } else if (animalType.equals("camel")) {
                                System.out.print("Введите цвет: ");
                                String color = scanner.nextLine();
                                Camel camel = new Camel(name, birthDate, say, color, new ArrayList<String>());
                                registry.addAnimal(camel);
                            } else if (animalType.equals("donkey")) {
                                System.out.print("Введите цвет: ");
                                String color = scanner.nextLine();
                                Donkey donkey = new Donkey(name, birthDate, say, color, new ArrayList<String>());
                                registry.addAnimal(donkey);
                            } else if (animalType.equals("hamster")) {
                                System.out.print("Введите цвет: ");
                                String color = scanner.nextLine();
                                Hamster hamster = new Hamster(name, birthDate, say, color, new ArrayList<String>());
                                registry.addAnimal(hamster);
                            } else {
                                System.out.println("Неподдерживаемый тип животного.");
                            }
                            input();
                            break;
                        case 2:
                            System.out.print("Введите имя животного: ");
                            String animalName = scanner.nextLine();
                            Animal animal = registry.getAnimalOfName(animalName);
                            if (animal instanceof HomeAnimal) {
                                System.out.println("Животное является домашним животным.");
                            } else if (animal instanceof PackAnimal) {
                                System.out.println("Животное является вьючным животным.");
                            } else {
                                System.out.println("Неизвестный тип животного.");
                            }
                            input();
                            break;
                        case 3:
                            System.out.print("Введите имя животного: ");
                            String animalName_ = scanner.nextLine();
                            registry.listCommands(registry.getAnimalOfName(animalName_));
                            input();
                            break;
                        case 4:
                            System.out.print("Введите имя животного: ");
                            String animalName__ = scanner.nextLine();
                            System.out.print("Введите новую команду для животного: ");
                            String newCommand = scanner.nextLine();
                            registry.teachAnimal(registry.getAnimalOfName(animalName__), newCommand);
                            input();
                            break;
                        case 5:
                            for (Animal anim : registry.getAnimals()) {
                                System.out.println(anim);
                            }
                            input();
                            break;
                        case 6:
                            help();
                            break;
                        case 0:
                            System.out.println("Выход из программы.");
                            break;
                        default:
                            System.out.println("Неправильный выбор. Попробуйте снова.");
                            break;
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    input();
                }
            }
            } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void help() {
        System.out.println("Меню:");
        System.out.println("0. Выход");
        System.out.println("1. Завести новое животное");
        System.out.println("2. Определить животное в правильный класс");
        System.out.println("3. Увидеть список команд, которые выполняет животное");
        System.out.println("4. Обучить животное новым командам");
        System.out.println("5. Список животных");
        System.out.println("6. Меню");
        System.out.println("");
        System.out.print("Выберите действие: ");
    }
    public static void input() {
        System.out.print("Выберите действие: ");
    }
}