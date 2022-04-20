##  AGGREGATE FUNCTIONS
```syntax
show databases;
```

| Database           |
|--------------------|
| blazers            |
| exercise           |
| girls              |
| information        |
| information_schema |
| movie              |
| mysql              |
| orders             |
| performance_schema |
| sakila             |
| students           |
| sys                |
| users              |
| world              |

14 rows in set (0.04 sec)
```syntax
 use blazers;
 ```
Database changed
```syntax
 show tables;
 ```

| Tables_in_blazers |
|-------------------|
| trail             |

1 row in set (0.02 sec)
```syntax
 select * from trail;
 ```

| name      | age  | gender | city           |
|-----------|------|--------|----------------|
| haiden    |   18 | male   | chennai        |
| gvm       |   17 | male   | ramanathapuram |
| rishi     |   19 | male   | tirupur        |
| riyas     |   20 | male   | tvli           |
| annamalai |   18 | male   | madhurai       |

5 rows in set (0.02 sec)
### COUNT
```syntax
 select  count(*) from trail;
 ```

| count(*) |
|----------|
|        5 |

1 row in set (0.01 sec)
### AVERAGE
```syntax
 select avg(age) from trail;
 ```

| avg(age) |
|----------|
|  18.4000 |

1 row in set (0.01 sec)
### MAXIMUM
```syntax
 select max(age) from trail;
 ```

| max(age) |
|----------|
|       20 |

1 row in set (0.01 sec)
### MINIMUM
```syntax
 select min(age) from trail;
 ```

| min(age) |
|----------|
|       17 |

1 row in set (0.00 sec)
### SUM
```syntax
select sum(age) from trail;
```

| sum(age) |
|----------|
|       92 |

1 row in set (0.00 sec)
