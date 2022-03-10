### VIEWS
show databases;

| Database           |
|--------------------|
| academy            |
| batch              |
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

16 rows in set (0.06 sec)

 use blazers;
Database changed
 show tables;

| Tables_in_blazers |
|-------------------|
| trail             |

1 row in set (0.02 sec)

 select * from trail;

| name      | age  | gender | city           |
|-----------|------|--------|----------------|
| haiden    |   18 | male   | chennai        |
| gvm       |   17 | male   | ramanathapuram |
| rishi     |   19 | male   | tirupur        |
| riyas     |   20 | male   | tvli           |
| annamalai |   18 | male   | madhurai       |

5 rows in set (0.04 sec)

mysql> insert into trail values ('abi',18,'female','tvli'),('jeru',19,'female','tvli'),('swedha',17,'female'),('saran',17,'female');
ERROR 1136 (21S01): Column count doesn't match value count at row 3
mysql> insert into trail values ('abi',18,'female','tvli'),('jeru',19,'female','tvli'),('swedha',17,'female','tvli'),('saran',17,'female','tvli');
Query OK, 4 rows affected (0.02 sec)
Records: 4  Duplicates: 0  Warnings: 0

 select * from trail;

| name      | age  | gender | city           |
|-----------|------|--------|----------------|
| haiden    |   18 | male   | chennai        |
| gvm       |   17 | male   | ramanathapuram |
| rishi     |   19 | male   | tirupur        |
| riyas     |   20 | male   | tvli           |
| annamalai |   18 | male   | madhurai       |
| abi       |   18 | female | tvli           |
| jeru      |   19 | female | tvli           |
| swedha    |   17 | female | tvli           |
| saran     |   17 | female | tvli           |

9 rows in set (0.00 sec)
### CREATE VIEW
CREATE VIEW blazers AS SELECT name,city from trail WHERE age>17;
Query OK, 0 rows affected (0.02 sec)
### SELECT VIEW
select * from blazers;
+-----------+----------+
| name      | city     |
+-----------+----------+
| haiden    | chennai  |
| rishi     | tirupur  |
| riyas     | tvli     |
| annamalai | madhurai |
| abi       | tvli     |
| jeru      | tvli     |
+-----------+----------+
6 rows in set (0.01 sec)
### REPLACE VIEW
 CREATE OR REPLACE VIEW blazers AS  SELECT name,age FROM trail WHERE gender='female';
Query OK, 0 rows affected (0.01 sec)

 select * from blazers;
+--------+------+
| name   | age  |
+--------+------+
| abi    |   18 |
| jeru   |   19 |
| swedha |   17 |
| saran  |   17 |
+--------+------+
4 rows in set (0.01 sec)
### RENAME TABLE NAME
 RENAME TABLE blazers TO team;
Query OK, 0 rows affected (0.01 sec)

 select * from team;
+--------+------+
| name   | age  |
+--------+------+
| abi    |   18 |
| jeru   |   19 |
| swedha |   17 |
| saran  |   17 |
+--------+------+
4 rows in set (0.01 sec)
### INSERT VALUES
 INSERT INTO team VALUES('vaish',18);
Query OK, 1 row affected (0.01 sec)

 select * from team;
+--------+------+
| name   | age  |
+--------+------+
| abi    |   18 |
| jeru   |   19 |
| swedha |   17 |
| saran  |   17 |
+--------+------+
4 rows in set (0.01 sec)
