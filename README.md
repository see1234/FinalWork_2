# 1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы, а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
**- cat > "Домашние животные"**<br>
***INPUT:***<br>
```
собаки
кошки
хомяки
```
**- cat > "Вьючные животные"**<br>
***INPUT:***<br>
```
лошади
верблюды
ослы
```
```
cat "Домашние животные" "Вьючные животные" > "Друзья человека"
cat "Друзья человека"
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo1.png)
# 2. Создать директорию, переместить файл туда.
```
mkdir "Животные"
mv "Друзья_животных" "Животные/"
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo2.png)
# 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
```
sudo apt-get update
sudo apt-get install software-properties-common
sudo apt-key adv --fetch-keys 'https://dev.mysql.com/doc/refman/8.0/en/checking-gpg-signature.html'
sudo add-apt-repository 'deb [arch=amd64] http://repo.mysql.com/apt/ubuntu/ focal mysql-8.0'
sudo apt-get update
sudo apt-get install mysql-server
```
# 4. Установить и удалить deb-пакет с помощью dpkg.
```
wget https://dev.mysql.com/get/mysql-apt-config_0.8.16-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.16-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server
sudo systemctl status mysql
sudo dpkg -r mysql-server
sudo dpkg -r mysql-apt-config
```
# 5. Выложить историю команд в терминале ubuntu
```
history
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo3.png)
# 6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы.
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo4.png)
# 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”
```
su root
mysql
```
```sql
CREATE DATABASE IF NOT EXISTS friends;
SHOW DATABASES;
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo5.png)
# 8. Создать таблицы с иерархией из диаграммы в БД
USE friends;
***INPUT:***<br>
```sql
CREATE TABLE animal
(
  id Int NOT NULL AUTO_INCREMENT,
  name_animal VARCHAR(64) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE home_animal
(
  id INT NOT NULL AUTO_INCREMENT,
  name_home VARCHAR(64) NOT NULL,
  animal_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE cat
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(64),
  color VARCHAR(64),
  home_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE dog
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(256),
  breed VARCHAR(64),
  home_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE hamster
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(256),
  color VARCHAR(64),
  home_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE pack_animal
(
  id INT NOT NULL AUTO_INCREMENT,
  name_pack VARCHAR(64) NOT NULL,
  animal_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE camel
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(256),
  color VARCHAR(64),
  pack_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE horse
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(256),
  color VARCHAR(64),
  pack_id INT,
  PRIMARY KEY (id)
);
CREATE TABLE mule
(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  date_birth Date NOT NULL,
  say VARCHAR(256),
  color VARCHAR(64),
  pack_id INT,
  PRIMARY KEY (id)
);
CREATE INDEX animal_home ON home_animal (animal_id);
CREATE INDEX home_cat ON cat (home_id);
CREATE INDEX home_dog ON dog (home_id);
CREATE INDEX home_hamster ON hamster (home_id);
CREATE INDEX animal_pack ON pack_animal (animal_id);
CREATE INDEX pack_camel ON camel (pack_id);
CREATE INDEX pack_horse ON horse (pack_id);
CREATE INDEX pack_mule ON mule (pack_id);
ALTER TABLE cat ADD CONSTRAINT home_to_cat FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE dog ADD CONSTRAINT home_to_dog FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE hamster ADD CONSTRAINT home_to_hamster FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE camel ADD CONSTRAINT pack_to_camel FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE horse ADD CONSTRAINT pack_to_horse FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE mule ADD CONSTRAINT pack_to_mule FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo6.png)
# 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
```sql
INSERT INTO home_animal(name_home, animal_id) VALUES ('Домашние', 1);
INSERT INTO cat (name, date_birth, say, color, home_id) VALUES('Барсик', '2023-01-01', 'МЯУУУУУ','пятнистый', 1);
INSERT INTO dog (name, date_birth, say, breed, home_id) VALUES('Jackson', '2021-06-01', 'Гав','хз', 1);
INSERT INTO hamster (name, date_birth, say, color, home_id) VALUES('Майкл', '2022-04-01', 'Гав','пятнистый', 1);
INSERT INTO pack_animal(name_pack, animal_id) VALUES ('Вьючные', 2);
INSERT INTO horse (name, date_birth, say, color, pack_id) VALUES('Лошид', '2023-08-01', 'Иго-го','пятнистый', 1);
INSERT INTO camel (name, date_birth, say, color, pack_id) VALUES('Верб', '2023-02-01', 'Вррб','пятнистый', 1);
INSERT INTO mule (name, date_birth, say, color, pack_id) VALUES('Осил', '2023-05-01', 'Вррб','пятнистый', 1);
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo7.png)
# 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
```sql
DELETE FROM camel;
```
# 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
```sql
CREATE TABLE young_animals (
  id INT NOT NULL,
  name VARCHAR(64),
  date_birth DATETIME,
  say VARCHAR(256),
  age VARCHAR(64)
);

INSERT INTO young_animals (id, name, date_birth, say, age)
SELECT id, name, date_birth, say,
  CONCAT(
    FLOOR(DATEDIFF(NOW(), date_birth) / 365), ' лет ',
    MOD(FLOOR(DATEDIFF(NOW(), date_birth) / 30.44), 12), ' мес.'
  ) AS age
FROM (
  SELECT id, name, date_birth, say FROM cat
  UNION ALL
  SELECT id, name, date_birth, say FROM dog
  UNION ALL
  SELECT id, name, date_birth, say FROM horse
  UNION ALL
  SELECT id, name, date_birth, say FROM mule
) AS animals
WHERE DATEDIFF(NOW(), date_birth) BETWEEN 365 AND 1095;

SELECT id, name, date_birth, say, age FROM young_animals;
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo8.png)
# 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
```sql
SELECT 'cat' AS animal_type, id, name, date_birth, say, color
FROM cat
UNION ALL
SELECT 'dog' AS animal_type, id, name, date_birth, say, breed
FROM dog
UNION ALL
SELECT 'hamster' AS animal_type, id,  name, date_birth, say, color
FROM hamster
UNION ALL
SELECT 'horse' AS animal_type, id, name, date_birth, say, color
FROM horse
UNION ALL
SELECT 'mule' AS animal_type, id, name, date_birth, say, color
FROM mule;
```
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo9.png)
# 13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
```java
import java.util.ArrayList;
import java.util.List;

class Animal {
    private String name;
    private String birthDate;
    private String say;
    private List<String> commands;

    public Animal(String name, String birthDate, String say) {
        this.name = name;
        this.birthDate = birthDate;
        this.say = say;
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
}

class HomeAnimal extends Animal {
    private String color;

    public HomeAnimal(String name, String birthDate, String say, String color) {
        super(name, birthDate, say);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Cat extends HomeAnimal {
    public Cat(String name, String birthDate, String say, String color) {
        super(name, birthDate, say, color);
    }
}

class Dog extends HomeAnimal {
    public Dog(String name, String birthDate, String say, String color) {
        super(name, birthDate, say, color);
    }
}

class Hamster extends HomeAnimal {
    public Hamster(String name, String birthDate, String say, String color) {
        super(name, birthDate, say, color);
    }
}

class PackAnimal extends Animal {
    private String color;

    public PackAnimal(String name, String birthDate, String say, String color) {
        super(name, birthDate, say);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Horse extends PackAnimal {
    private int speed;

    public Horse(String name, String birthDate, String say int speed) {
        super(name, birthDate, say, "null");
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

class Camel extends PackAnimal {
    public Camel(String name, String birthDate, String say, String color) {
        super(name, birthDate, say, color);
    }
}

class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate, String say, String color) {
        super(name, birthDate, say, color);
    }
}
```
# 14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал:
**14.1 Завести новое животное**<br>
**14.2 определять животное в правильный класс**<br>
**14.3 увидеть список команд, которое выполняет животное**<br>
**14.4 обучить животное новым командам**<br>
**14.5 Реализовать навигацию по меню**<br>
**15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля.**<br>
***Итоги:***<br>
*Ссылка на выполненное задание 14-15*<br>
**https://github.com/see1234/itg/tree/main/code**<br>
![me](https://github.com/see1234/itg/blob/main/images/photo10.png)
![me](https://github.com/see1234/itg/blob/main/images/photo11.png)
![me](https://github.com/see1234/itg/blob/main/images/photo12.png)
![me](https://github.com/see1234/itg/blob/main/images/photo13.png)