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
![me](https://github.com/see1234/itg/blob/main/images/photo4.png)
# 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”
# 8. Создать таблицы с иерархией из диаграммы в БД
# 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
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