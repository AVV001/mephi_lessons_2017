# Лабораторная работа 3

 Покер 12 баллов,   21 - 6 баллов, и то и то 15 баллов

1. покер 
Играет 1 человек. 
В колоде 52 карты, вначале вы получаете случайные 2 карты, найти вероятность собрать определённую комбинацию 
на трёх этапах:
   - на префлопе открыто 0 дополнительных карт
   - на флопе-открыты дополнительно три карты из колоды
   - на тёрне: открыты 4 карты
Комбинация считается сложившейся, если в ней участвуют обе карты, которые на руках или если участвовует одна или вообще не участвовуют.
Построить 3 графика: (для трех, четырёх и нуля дополнительно открытых карт) зависимость вероятности получения комбинации от начальных двух карт на руках. 

2. Очко
Играет 1 человек.
В колоде 52 карты, вначале вы получаете случайные 2 карты, найти вероятность набрать ровно 21 очко в следующий ход в зависимости от карт на руках.
Простроить графики(минимум три), как в первой задаче. Один из графиков должен отображать граничный случай, когда даже добор одной дополнительной карте на следующем ходе, не зависимо от ваших карт на руках, приведет к перебору.  

# Вопросы и ответы:
1. Изначально комбинацией может быть С из 52 по 2, то есть 1326,
но для комбинаций не нужно такое разнообразие, например для каре важно только что на руках парные или непарные карты, то есть по оси абсцисс вместо 1326 точек будет только две, остальные дублируют друг друга, как с этим быть??
Не согласен, пример с каре, я могу собрать каре даже если у меня на руках не парные карты. В покере выбирается лучшая комбинация из пяти карт, пять карт выбираются из семи лежащих на столе. Две из руки и пять дополнительных.

1. Может комбинацию задавать не просто наименованием, но и конкретными картами, например, не просто каре, а каре из четырёх королей??)
Нет, это будет слишком просто.

1. Данную задачу можно решить просто математически без программирования, тогда в чем заключается наша задача? Задать формулу подсчета вероятности компьютеру, чтобы не считать самому?) 
Можете решать и таким образом, будте готовы выводить эти формулы) Если лень дома выводить эти формулы, можете решать перебором.

## Инструкция по применению для задачи с покером
1. Открываем наш гуглдок с вашим списком и оценками
1. Высчитываем ваш номер начиная с нуля и пропуская людей, получивших автомат
1. Находим остаток от деления получившегося числа на три
1. Если 0 - то стрит. Если 1 - то флеш. Если 2 - то Фулл Хаус.
1. Выполняем задание для вашей комбинации
1. Делаем pull request
1. Наслаждаемся)

## Инструкция по применению для задачи с 21
1. Выполняем задание 
1. Делаем pull request
1. Наслаждаемся чуть-чуть меньше, задание было простеньким)


