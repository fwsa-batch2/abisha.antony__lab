## JOINS
```syntax
 use movie;
 ```
Database changed
show tables;

| Tables_in_movie |
|-----------------|
| movie           |
| star            |
| stars           |

3 rows in set (0.01 sec)

```syntax
 select * from movie;
 ```

| id | movie        | released_year | language | imdb_rating |
|----|--------------|---------------|----------|-------------|
|  1 | kaithi       |          2020 | tamil    |           6 |
|  2 | asuran       |          2021 | tamil    |           6 |
|  3 | vada_chennai |          2021 | tamil    |           9 |
|  4 | master       |          2021 | tamil    |        NULL |
|  5 | anniyan      |          2017 | tamil    |        NULL |

5 rows in set (0.03 sec)

```syntax
 select * from star;
 ```
Empty set (0.03 sec)
```syntax
select * from stars;
```

| id | theatre      | movie_director |
|----|--------------|----------------|
|  1 | ram          | lokesh         |
|  2 | pss          | vetrimaran     |
|  3 | pvr          | vetrimaaran    |
|  4 | pvt          | lokesh         |
|  5 | jazz_cinemas | shankar        |

5 rows in set (0.02 sec)
### INNER JOIN
```syntax
 select * from movie inner join stars on movie.id = stars.id;
 ```

| id | movie        | released_year | language | imdb_rating | id | theatre      | movie_director |
|----|--------------|---------------|----------|-------------|----|--------------|----------------|
|  1 | kaithi       |          2020 | tamil    |           6 |  1 | ram          | lokesh         |
|  2 | asuran       |          2021 | tamil    |           6 |  2 | pss          | vetrimaran     |
|  3 | vada_chennai |          2021 | tamil    |           9 |  3 | pvr          | vetrimaaran    |
|  4 | master       |          2021 | tamil    |        NULL |  4 | pvt          | lokesh         |
|  5 | anniyan      |          2017 | tamil    |        NULL |  5 | jazz_cinemas | shankar        |

5 rows in set (0.00 sec)
### LEFT JOIN
```syntax
 select * from movie left join stars on movie.id = stars.id;
 ```

| id | movie        | released_year | language | imdb_rating | id   | theatre      | movie_director |
|----|--------------|---------------|----------|-------------|------|--------------|----------------|
|  1 | kaithi       |          2020 | tamil    |           6 |    1 | ram          | lokesh         |
|  2 | asuran       |          2021 | tamil    |           6 |    2 | pss          | vetrimaran     |
|  3 | vada_chennai |          2021 | tamil    |           9 |    3 | pvr          | vetrimaaran    |
|  4 | master       |          2021 | tamil    |        NULL |    4 | pvt          | lokesh         |
|  5 | anniyan      |          2017 | tamil    |        NULL |    5 | jazz_cinemas | shankar        |

5 rows in set (0.01 sec)
### RIGHT JOIN
```syntax
 select * from movie right join stars on movie.id = stars.id;

| id   | movie        | released_year | language | imdb_rating | id | theatre      | movie_director |
|------|--------------|---------------|----------|-------------|----|--------------|----------------|
|    1 | kaithi       |          2020 | tamil    |           6 |  1 | ram          | lokesh         |
|    2 | asuran       |          2021 | tamil    |           6 |  2 | pss          | vetrimaran     |
|    3 | vada_chennai |          2021 | tamil    |           9 |  3 | pvr          | vetrimaaran    |
|    4 | master       |          2021 | tamil    |        NULL |  4 | pvt          | lokesh         |
|    5 | anniyan      |          2017 | tamil    |        NULL |  5 | jazz_cinemas | shankar        |

5 rows in set (0.00 sec)
### CROSS JOIN

```syntax

select * from movie cross join stars ;
```

| id | movie        | released_year | language | imdb_rating | id | theatre      | movie_director |
|----|--------------|---------------|----------|-------------|----|--------------|----------------|
|  1 | kaithi       |          2020 | tamil    |           6 |  5 | jazz_cinemas | shankar        |
|  1 | kaithi       |          2020 | tamil    |           6 |  4 | pvt          | lokesh         |
|  1 | kaithi       |          2020 | tamil    |           6 |  3 | pvr          | vetrimaaran    |
|  1 | kaithi       |          2020 | tamil    |           6 |  2 | pss          | vetrimaran     |
|  1 | kaithi       |          2020 | tamil    |           6 |  1 | ram          | lokesh         |
|  2 | asuran       |          2021 | tamil    |           6 |  5 | jazz_cinemas | shankar        |
|  2 | asuran       |          2021 | tamil    |           6 |  4 | pvt          | lokesh         |
|  2 | asuran       |          2021 | tamil    |           6 |  3 | pvr          | vetrimaaran    |
|  2 | asuran       |          2021 | tamil    |           6 |  2 | pss          | vetrimaran     |
|  2 | asuran       |          2021 | tamil    |           6 |  1 | ram          | lokesh         |
|  3 | vada_chennai |          2021 | tamil    |           9 |  5 | jazz_cinemas | shankar        |
|  3 | vada_chennai |          2021 | tamil    |           9 |  4 | pvt          | lokesh         |
|  3 | vada_chennai |          2021 | tamil    |           9 |  3 | pvr          | vetrimaaran    |
|  3 | vada_chennai |          2021 | tamil    |           9 |  2 | pss          | vetrimaran     |
|  3 | vada_chennai |          2021 | tamil    |           9 |  1 | ram          | lokesh         |
|  4 | master       |          2021 | tamil    |        NULL |  5 | jazz_cinemas | shankar        |
|  4 | master       |          2021 | tamil    |        NULL |  4 | pvt          | lokesh         |
|  4 | master       |          2021 | tamil    |        NULL |  3 | pvr          | vetrimaaran    |
|  4 | master       |          2021 | tamil    |        NULL |  2 | pss          | vetrimaran     |
|  4 | master       |          2021 | tamil    |        NULL |  1 | ram          | lokesh         |
|  5 | anniyan      |          2017 | tamil    |        NULL |  5 | jazz_cinemas | shankar        |
|  5 | anniyan      |          2017 | tamil    |        NULL |  4 | pvt          | lokesh         |
|  5 | anniyan      |          2017 | tamil    |        NULL |  3 | pvr          | vetrimaaran    |
|  5 | anniyan      |          2017 | tamil    |        NULL |  2 | pss          | vetrimaran     |
|  5 | anniyan      |          2017 | tamil    |        NULL |  1 | ram          | lokesh         |

25 rows in set (0.01 sec)
