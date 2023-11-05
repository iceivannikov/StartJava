\echo Selects all rows from the jaegers table and sorts them by the model_name field
SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo Selects all rows from the jaegers table where the status is not 'Destroyed' and 
\echo sorts them by the model_name field
SELECT * 
  FROM jaegers 
 WHERE status != 'Destroyed' 
 ORDER BY model_name;

\echo Selects all rows from the jaegers table where the value of the mark field is 'Mark-1' or 
\echo 'Mark-4' and sorts them by the model_name field
SELECT * 
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

\echo Selects all rows from the jaegers table where the mark field value is not 'Mark-1' or 
\echo 'Mark-4' and sorts them by the model_name field
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

\echo Selects all rows from the jaegers table and sorts them by the mark field in reverse order
SELECT * 
  FROM jaegers 
 ORDER BY mark DESC;

\echo Selects all rows from the jaegers table where the value of the launch field is equal to the 
\echo minimum launch date, and sorts them by the model_name field
SELECT * 
  FROM jaegers 
 WHERE launch = 
       (SELECT MIN(launch) 
          FROM jaegers)
 ORDER BY model_name;

\echo Selects all rows from the jaegers table where the value of the kaiju_kill field is equal 
\echo to the maximum number of kaiju killed, and sorts them by the model_name field
SELECT * 
  FROM jaegers 
 WHERE kaiju_kill = 
       (SELECT MAX(kaiju_kill) 
          FROM jaegers)
 ORDER BY model_name;

\echo Calculates the average value of the weight field, rounded to three decimal places
SELECT ROUND(AVG(weight), 3) 
  FROM jaegers;

\echo Increments the value of the kaiju_kill field by one for all rows in the jaegers table 
\echo where the status is not 'Destroyed', and then sorts them by the model_name field
UPDATE jaegers 
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo Removes all rows from the jaegers table where the status is 'Destroyed', and then sorts 
\echo the remaining rows by the model_name field
DELETE 
  FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;