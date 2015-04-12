# ITIS-JAVA-SPRING-2015
Недельный курс по Spring

####Преподаватель: Барух Садогурский

##### Задания:
###### Задание№1 
<ul>
<li>Написать свою аннотацию, скажем <code>@RunThisMethod</code></li>
<li>У неё должен быть параметр <code>repeat</code></li>
<li>Написать <code>ObjectFactory</code> c методом <code>createObject()</code></li>
<li>Метод получает тип класса, и возвращает объект данного типа, но если в этом классе, есть методы, аннотированные <code>@RunThisMethod</code>.<code>ObjectFactory</code> должна из запустить соотвественно значению параметра <code>repeat</code></li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task1/)
###### Задание№2

<ul>
<li>Написать interface <code>Quoter</code> с методом <code>sayQuote</code> и 2 реализации</li>
<li><code>ShakespearQuoter</code> (c property message) and <code>TerminatorQuoter</code> (messages)</li>
<li>По вызову метода <code>sayQuote()</code> они печатаю все сообщения</li>
<li>Прописать их как бины в контексте и впрыснуть в xml-e им сообщения</li>
<li>Протестировать
  <ul>
      <li>Создать контекст и сделать поиск</li>
      <li>Попробовать сделать поиск не только по имени, но и по интерфэйсу.</li>
  </ul>
</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task2/)
###### Задание№3
<ul>
<li>Написать интерфэйс с реализацией <code>TalkingRobot</code>  у которого будет <code>List<Quoter></code> и (прописать метод talk, чтобы он делегировал на все методы quote из всех Quoter-ов)</li>
<li>Определить этот бин в xml-e и впрыснуть ему оба quoter-a</li>
<li>Определить метод <code>talk()</code>, как init-method</li>
<li>В тесте только создавать контекст</li>
<li>Изменить scope на prototype</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task3/)
###### Задание№4
<ul>
<li>Создать бин класса <code>String</code>, внести в него <code>value (“trust me”)</code></li>
<li>Впрыснуть его в лист цитат терминатора</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task4/)

###### Задание№5
<ul>
<li>Напишите свой <code>BeanPostProcessor</code>, который будет запускать методы аннотированные <code>@RunThisMethod</code></li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task5/)
###### Задание№6
<ul>
<li>Напишите <code>BeanPostProcessor</code> который будет искать кастомную аннотацию <code>@InjectRandomInt</code></li>
<li>У этой аннотации будут параметры <code>min</code> & <code>max</code></li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task6/)
###### Задание№7
<ul>
<li>Пишем прокси, который будет замерять время вызова метода</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task7/)
###### Задание№8
<ul>
<li>Benchmark, который будет замерять время вызова метода с помощью dynamic proxy</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task8/)
###### Задание№9
<ul>
<li>Напишите свой <code>BeanPostProcessor</code>, который будет печатать сколько времени работал метод аннотированный <code>@Benchmark</code></li>
<li>Аннотация должна находится над классом – и все его методы должны быть завернуты в логику бенчмарка</li>
<li>А теперь улучшим наш framework. Теперь аннотация должна считываться с метода, а не класса.</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task9/)
###### Задание№10
<ul>
<li>Напишите еще один <code>BeanPostProcessor</code> который будет делать прокси.</li>
<li>Например которые обворачивает транзакцией все методы бинов, класс которых аннотирован <code>@Transaction</code></li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task10/)
###### Задание№11
<ul>
<li>Прикрутите дополнительный компонент, который будет выводить лог названия всех destroy методов определенных для прототайпов, с предупреждением, что они работать не будет</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task11/)

##День второй

###### Задание№12
<ul>
<li>Напишите собственную аннотацию, которая будет расширять <code>@Deprecated</code>. Данную аннотацию будут ставить над устаревшими классами
</li>
<li>У этой аннотации будет параметр <code>newClass</code> указывающий на новую имплементацию
</li>
<li>Напишите <code>BeanFactoryPostProcessor</code>, который будет заменять все устаревшие классы на новые
</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task12/)

###### Задание№13
<ul>
<li>Напишите <code>FactoryBean</code> для чего нибудь (например, StringBuilder)</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/Task13/)
###### Задание№14
<ul>
<li>Напишите singleton в который впрыснут prototype.
</li>
<li>Проверьте, когда обновляется prototype
</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task14/)
###### Задание№15
<ul>
<li>Напишите 2 аннотации <code>@Oracle</code> и <code>@Derby</code></li>
<li>Напишите 2 класса имплементирующие интерфейс <code>Dao</code> с методом <code>crud()</code></li>
<li>Один из классов является имплементаций оракла, второй дерби</li>
<li>Укажите это при помощи собственных аннотаций</li>
<li>Напишите сервис, в с проперти <code>Dao</code> и инжекните в него один раз имплементацию оракла, а второй дерби, при помощи собсвенных аннотаций</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task15/)

###### Задание№16
<ul>
<li>Напишите свой <code>DatabaseRuntimeException</code></li>
<liНапишите Аспект, который будет посылать мэйл с текстом ошибки этого исключения всем работникам DBA</li>
<li>Мэйлы всех работников DBA должны впрыскиваться в аспект</li>
<li>Попробуйте чтобы stack trace исключения был глубже чем один</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task16/)

###### Задание№17
<ul>
<li>Напишите аспект, который будет перехватывать все методы возвращающий объекты аннотированные <code>@MyDeprecated</code> и будет заменять то, что должно вернуться, на объект из нового класса, указанный в аннотации.</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task17/)
###### Задание№18
<ul>
<li>Напишите свою аннотацию @PostInitialized</li>
<li>Пропишите свой ContextListener, чтобы он по contextRefreshed, запускал все методы, аннотированные этой аннотацией</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task18/)

###### Задание№19
<ul>
<li>Пишем систему регистраций на эвент</li>
<li>Модель: Классы для эвента, гостя, заказа, и .т.д</li>
<li>Сервис: Бизнес методы: зарегистрироваться, посмотреть список гостей</li>
<li>Репозиторий: Работа с JDBC Template для реализации доступа к данным</li>
<li>База данных: embedded h2 - compile 'com.h2database:h2:1.4.186'</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task19/)

###### Задание№20
<ul>
<li>Сделайте тоже самое, но используя Java Config</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task20/)

###### Задание№21
<ul>
<li>Напишите класс Водитель</li>
<li>Имя не может быть null</li>
<li>Не пьющий</li>
<li>Проверьте валидатором объект водителя и распечатайте все ошибки</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task21/)

###### Задание№22
<ul>
<li>А теперь напишите Taxi, в который будет впрыскиваться валидный Driver</li>
<li>Проверьте при помощи валидатора, что Taxi валидный.</li>
<li>В данном случае это значит, что водитель, который в него впрыснут прошел все проверки</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task22/)

###### Задание№23
<ul>
<li>Написать кастомную аннотацию @ValidCredentials</li>
<li>Которая будет проверять что у объекта логин пароль не длиннее, чем имя</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task23/)


###### Задание№24
<ul>

<li>Сконфигурируйте проект</li>
<li>Смэпите простой файл</li>

<li>Создайте controller для /hello</li>
<li>Верните jsp</li>
<li>Попробуйте всякие другие маппирования</li>

<li>Добавляем контроллер посложнее, который принимает параметр в URL и показывает его обратно пользователю</li>
<li>Также, печатает все header-ы</li>

<li>Напишите хэндлер, который принимает текст и отправляет его обратно</li>
<li>Напишите хэнлдер, который принимает JSON, делает из него объект, и отправляет обратно JSON-ом.</li>
<li>А теперь принимает XML а отправляет обратно JSON-ом.</li>
<li>Напишите тесты с помощью HttpClient</li>

<li>Переведите все стринговые методы на работу с HttpEntity</li>
<li>Переведите метод, который создает объект на работу с HttpEntity. Также, пусть он проставляет Location header  и возвращает код 201 (Created).</li>

<li>Пропишите SimpleMappingExceptionResolver</li>
<li>Напишите контроллер который кидает исключение, которое вы прописали и проверьте, что маппинг работает</li>
<li>Реализуйте метод @ExceptionHandler</li>

<li>Создайте класс модели, который мы будем использовать для связки данных</li>
<li>Наполните его из параметров запроса</li>
<li>Попробуйте с HTML формой</li>

<li>Перепишите форму с этим taglib-ом</li>
<li>Добавьте тэгов ошибок для демонстрации ошибок конверсии</li>
<li>Добавьте чекбокс</li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task24/)
