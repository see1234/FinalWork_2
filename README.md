# 1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы, а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
**- cat > "Домашние животные"**<br>
***INPUT:***<br>
**собаки**<br>
**кошки**<br>
**хомяки**<br>
***END***<br>
**- cat > "Вьючные животные"**<br>
***INPUT:***<br>
**лошади**<br>
**верблюды**<br>
**ослы**<br>
***END***<br>
**- cat "Домашние животные" "Вьючные животные" > "Друзья человека"**<br>
**- cat "Друзья человека"**<br>
***OUTPUT:***<br>
***END***<br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo1.png)
# 2. Создать директорию, переместить файл туда.
**- mkdir "Животные"**<br>
**- mv "Друзья_животных" "Животные/"**<br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo2.png)
# 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
**- sudo apt-get update**<br>
**- sudo apt-get install software-properties-common**<br>
**- sudo apt-key adv --fetch-keys 'https://dev.mysql.com/doc/refman/8.0/en/checking-gpg-signature.html'**<br>
**- sudo add-apt-repository 'deb [arch=amd64] http://repo.mysql.com/apt/ubuntu/ focal mysql-8.0'**<br>
**- sudo apt-get update**<br>
**- sudo apt-get install mysql-server**<br>
# 4. Установить и удалить deb-пакет с помощью dpkg.
**- wget https://dev.mysql.com/get/mysql-apt-config_0.8.16-1_all.deb**<br>
**- sudo dpkg -i mysql-apt-config_0.8.16-1_all.deb**<br>
**- sudo apt-get update**<br>
**- sudo apt-get install mysql-server**<br>
**- sudo systemctl status mysql**<br>
**- sudo dpkg -r mysql-server**<br>
**- sudo dpkg -r mysql-apt-config**<br>
# 5. Выложить историю команд в терминале ubuntu
**- history**<br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo3.png)
# 6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы.
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo4.png)
# 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”
**- su root**<br>
**- mysql**<br>
**(MYSQL) - CREATE DATABASE IF NOT EXISTS friends;**<br>
**(MYSQL) - SHOW DATABASES;**<br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo5.png)
# 8. Создать таблицы с иерархией из диаграммы в БД
**- USE friends;**<br>
***INPUT:***<br>
**CREATE TABLE animals** (<br>
  **id INT PRIMARY KEY AUTO_INCREMENT,**<br>
  **name VARCHAR(256),**<br>
  **age INT(128),**<br>
  **height DOUBLE,**<br>
  **type ENUM('domestic', 'pack'),**<br>
  **sound VARCHAR(64),**<br>
  **toilet ENUM('yes', 'no')**<br>
**);** <br>
**CREATE TABLE domestic_animals (** <br>
  **id INT PRIMARY KEY,** <br>
  **breed VARCHAR(64),** <br>
  **FOREIGN KEY (id) REFERENCES animals(id)** <br>
**);** <br>
**CREATE TABLE pack_animals (** <br>
  **id INT PRIMARY KEY,** <br>
  **load_capacity INT(64),** <br>
  **FOREIGN KEY (id) REFERENCES animals(id)** <br>
**);** <br>
**CREATE TABLE dogs (** <br>
  **id INT PRIMARY KEY,** <br>
  **gender ENUM('FEMALE', 'MALE'),** <br>
  **size ENUM('small', 'medium', 'large'),** <br>
  **FOREIGN KEY (id) REFERENCES domestic_animals(id)** <br>
**);** <br>
**CREATE TABLE cats (** <br>
  **id INT PRIMARY KEY,** <br>
  **gender ENUM('FEMALE', 'MALE'),** <br>
  **color VARCHAR(50),** <br>
  **FOREIGN KEY (id) REFERENCES domestic_animals(id)** <br>
**);** <br>
**CREATE TABLE hamsters (** <br>
  **id INT PRIMARY KEY,** <br>
  **color VARCHAR(50),** <br>
  **size ENUM('small', 'medium', 'large'),** <br>
  **FOREIGN KEY (id) REFERENCES domestic_animals(id)** <br>
**);** <br>
**CREATE TABLE horses (** <br>
  **id INT PRIMARY KEY,** <br>
  **breed VARCHAR(50),** <br>
  **color VARCHAR(50),** <br>
  **FOREIGN KEY (id) REFERENCES pack_animals(id)** <br>
**);** <br>
**CREATE TABLE camels (** <br>
  **id INT PRIMARY KEY,** <br>
  **color VARCHAR(50),** <br>
  **size ENUM('small', 'medium', 'large'),** <br>
  **FOREIGN KEY (id) REFERENCES pack_animals(id)** <br>
**);** <br>
**CREATE TABLE donkeys (** <br>
  **id INT PRIMARY KEY,** <br>
  **color VARCHAR(50),** <br>
  **size ENUM('small', 'medium', 'large'),** <br>
  **FOREIGN KEY (id) REFERENCES pack_animals(id)** <br>
**);** <br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo6.png)
# 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
**INSERT INTO dogs (id, name, command, birthdate) VALUES**<br>
  **(6, 'Dog1', 'Sit', '2015-06-06'),**<br>
  **(7, 'Dog2', 'Stay', '2016-07-07');**<br>
**INSERT INTO cats (id, name, command, birthdate) VALUES**<br>
  **(8, 'Cat1', 'Meow', '2017-08-08'),**<br>
  **(9, 'Cat2', 'Purr', '2018-09-09');**<br>
**INSERT INTO pack_animals (id, name, birthdate) VALUES**<br>
  **(10, 'Horse1', '2019-10-10'),**<br>
  **(11, 'Camel1', '2020-11-11'),**<br>
  **(12, 'Donkey1', '2021-12-12');**<br>
**INSERT INTO horse (id, name, birthdate) VALUES**<br>
  **(10, 'Horse1', '2019-10-10');**<br>
**INSERT INTO camels (id, name, birthdate) VALUES**<br>
  **(11, 'Camel1', '2020-11-11');**<br>
**INSERT INTO donkeys (id, name, birthdate) VALUES**<br>
  **(12, 'Donkey1', '2021-12-12');**<br>
# 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
# 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
# 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
# 13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
# 14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал:
## 14.1 Завести новое животное
## 14.2 определять животное в правильный класс
## 14.3 увидеть список команд, которое выполняет животное
## 14.4 обучить животное новым командам
## 14.5 Реализовать навигацию по меню
# 15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля.