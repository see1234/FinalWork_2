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
**CREATE TABLE animal**<br>
**(**<br>
  **id Int NOT NULL AUTO_INCREMENT,**<br>
  **name_animal VARCHAR(64) NOT NULL,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE home_animal**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name_home VARCHAR(64) NOT NULL,**<br>
  **animal_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE cat**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(30) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(),**<br>
  **color VARCHAR(20),**<br>
  **home_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE dog**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(30) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(256),**<br>
  **breed VARCHAR(64),**<br>
  **home_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE hamster**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(30) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(256),**<br>
  **color VARCHAR(64),**<br>
  **home_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE pack_animal**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name_pack VARCHAR(64) NOT NULL,**<br>
  **animal_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE camel**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(64) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(256),**<br>
  **color VARCHAR(64),**<br>
  **pack_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE horse**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(64) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(256),**<br>
  **color VARCHAR(64),**<br>
  **pack_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE TABLE mule**<br>
**(**<br>
  **id INT NOT NULL AUTO_INCREMENT,**<br>
  **name VARCHAR(64) NOT NULL,**<br>
  **date_birth Date NOT NULL,**<br>
  **say VARCHAR(256),**<br>
  **color VARCHAR(64),**<br>
  **pack_id INT,**<br>
  **PRIMARY KEY (id)**<br>
**);**<br>
**CREATE INDEX animal_home ON home_animal (animal_id);**<br>
**CREATE INDEX home_cat ON cat (home_id);**<br>
**CREATE INDEX home_dog ON dog (home_id);**<br>
**CREATE INDEX home_hamster ON hamster (home_id);**<br>
**CREATE INDEX animal_pack ON pack_animal (animal_id);**<br>
**CREATE INDEX pack_camel ON camel (pack_id);**<br>
**CREATE INDEX pack_horse ON horse (pack_id);**<br>
**CREATE INDEX pack_mule ON mule (pack_id);**<br>
**ALTER TABLE home_animal ADD CONSTRAINT animal_to_home FOREIGN KEY (animal_id) REFERENCES animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE cat ADD CONSTRAINT home_to_cat FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE dog ADD CONSTRAINT home_to_dog FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE hamster ADD CONSTRAINT home_to_hamster FOREIGN KEY (home_id) REFERENCES home_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE camel ADD CONSTRAINT pack_to_camel FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE horse ADD CONSTRAINT pack_to_horse FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
**ALTER TABLE mule ADD CONSTRAINT pack_to_mule FOREIGN KEY (pack_id) REFERENCES pack_animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT;**<br>
***Итоги:***<br>
![me](https://github.com/see1234/itg/blob/main/images/photo6.png)
# 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
**INSERT INTO home_animal(name_home, animal_id) VALUES ('Домашние', 1);**<br>
**INSERT INTO cat (name, date_birth, say, color, home_id) VALUES('Барсик', '2023-01-01', 'МЯУУУУУ','пятнистый', 1);**<br>
**INSERT INTO dog (name, date_birth, say, breed, home_id) VALUES('Jackson', '2021-06-01', 'Гав','хз', 1);**<br>
**INSERT INTO hamster (name, date_birth, say, color, home_id) VALUES('Майкл', '2022-04-01', 'Гав','пятнистый', 1);**<br>
**INSERT INTO pack_animal(name_pack, animal_id) VALUES ('Вьючные', 2);**<br>
**INSERT INTO horse (name, date_birth, say, color, pack_id) VALUES('Лошид', '2023-08-01', 'Иго-го','пятнистый', 1);**<br>
**INSERT INTO camel (name, date_birth, say, color, pack_id) VALUES('Верб', '2023-02-01', 'Вррб','пятнистый', 1);**<br>
**INSERT INTO mule (name, date_birth, say, color, pack_id) VALUES('Осил', '2023-05-01', 'Вррб','пятнистый', 1);**<br>
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