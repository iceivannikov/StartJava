-- Выбирает все строки из таблицы jaegers и сортирует их по полю model_name
\echo Selecting all rows from jaegers table and ordering by model_name
SELECT * 
  FROM jaegers 
 ORDER BY model_name;

-- Выбирает все строки из таблицы jaegers, где статус не равен 'Destroyed', и сортирует их по полю 
-- model_name
\echo Selecting all rows from jaegers table where status is not equal to 'Destroyed' and ordering 
by model_name
SELECT * 
  FROM jaegers 
 WHERE status != 'Destroyed' 
 ORDER BY model_name;

-- Выбирает все строки из таблицы jaegers, где значение поля mark является 'Mark-1' или 'Mark-4', 
-- и сортирует их по полю model_name
\echo Selecting all rows from jaegers table where mark is either 'Mark-1' or 'Mark-4' and ordering 
by model_name
SELECT * 
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

-- Выбирает все строки из таблицы jaegers, где значение поля mark не является 'Mark-1' или 
-- 'Mark-4', и сортирует их по полю model_name
\echo Selecting all rows from jaegers table where mark is not 'Mark-1' or 'Mark-4' and 
ordering by model_name
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

-- Выбирает все строки из таблицы jaegers и сортирует их по полю mark в обратном порядке 
-- (по убыванию)
\echo Selecting all rows from jaegers table and ordering by mark in descending order
SELECT * 
  FROM jaegers 
 ORDER BY mark 
  DESC;

-- Выбирает все строки из таблицы jaegers, где значение поля launch равно максимальной дате запуска,
-- и сортирует их по полю model_name
\echo Selecting all rows from jaegers table where launch date is equal to maximum launch date and 
ordering by model_name
SELECT * 
  FROM jaegers 
 WHERE launch = 
       (SELECT MAX(launch) 
          FROM jaegers);

-- Выбирает все строки из таблицы jaegers, где значение поля kaiju_kill равно максимальному 
-- количеству уничтоженных kaiju, и сортирует их по полю model_name.
\echo Selecting all rows from jaegers table where kaiju_kill is equal to maximum kaiju_kill and 
ordering by model_name.
SELECT * 
  FROM jaegers 
 WHERE kaiju_kill = 
       (SELECT MAX(kaiju_kill) 
        FROM jaegers);

-- Вычисляет среднее значение поля kaiju_kill с округлением до трех знаков после запятой.
\echo Calculating the average value of kaiju_kill with rounding to three decimal places.
SELECT ROUND(AVG(kaiju_kill), 3) 
  FROM jaegers;

-- Увеличивает значение поля kaiju_kill на единицу для всех строк таблицы jaegers, где статус 
-- не равен 'Destroyed', а затем сортирует их по полю model_name.
\echo Updating kaiju_kill field by incrementing it with 1 for all rows in jaegers table where 
status is not equal to 'Destroyed' and ordering by model_name.
UPDATE jaegers 
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

-- Удаляет все строки из таблицы jaegers, где статус не равен 'Destroyed', а затем сортирует 
-- оставшиеся строки по полю model_name.
\echo Deleting all rows from jaegers table where status is not equal to 'Destroyed' and 
ordering by model_name.
DELETE 
  FROM jaegers 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;