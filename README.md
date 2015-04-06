# ITIS-JAVA-SPRING-2015
Недельный курс по Spring

####Перподователь: Барух Садогурский

##### Задания:
###### Задание№1 
<ul>
<li>Написать свою аннотацию, скажем <code>@RunThisMethod</code></li>
<li>У неё должен быть параметр <code>repeat</code></li>
<li>Написать <code>ObjectFactory</code> c методом <code>createObject()</code></li>
<li>Метод получает тип класса, и возвращает объект данного типа, но если в этом классе, есть методы, аннотированные <code>@RunThisMethod</code>.<code>ObjectFactory</code> должна из запустить соотвественно значению параметра <code>repeat</code></li>
</ul>
######Исходники: [sources](/src/main/java/su/dalv/itis/java/spring/task1/ObjectFactory.java)
###### Задание№2

<ul>
<li>Написать interface <code>Quoter</code> с методом <code>sayQuote</code> и 2 реализации</li>
<li><code>ShakespearQuoter</code> (c property message) and <code>TerminatorQuoter</code> (messages)</li>
<li>По вызову метода <code>sayQuote()<code> они печатаю все сообщения</li>
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
<li>Что то пошло не так</li>
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
<li>У этой аннотации будут параметры min & max</li>
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
<li>Напишите свой <code>BeanPostProcessor</code>, который будет печатать сколько времени работал метод аннотированный @Benchmark</li>
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
