mysql> create database batch;
Query OK, 1 row affected (0.01 sec)

mysql> show databases;

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

16 rows in set (0.01 sec)

mysql> use batch;
Database changed
mysql> create table users(id int primary key auto_increment,name varchar(20));
Query OK, 0 rows affected (0.06 sec)

mysql> insert into users values(1,'surya');
Query OK, 1 row affected (0.01 sec)


mysql> insert into users (name) values('dhaiya'),('surya'),('yusuf),('suguram'),('aswath');

insert into users (name) values('dhaiya'),('surya'),('' at line 1
mysql> select* from  users;

| id | name  |
|----|-------|
|  1 | surya |

1 row in set (0.00 sec)

mysql> insert into users (name) values('dhaiya'),('surya'),('yusuf'),('suguram'),('aswath');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select* from  users;

| id | name    |
|----|---------|
|  1 | surya   |
|  2 | dhaiya  |
|  3 | surya   |
|  4 | yusuf   |
|  5 | suguram |
|  6 | aswath  |

6 rows in set (0.01 sec)

mysql> create table batches(id int primary key auto_increment,name varchar(20));
Query OK, 0 rows affected (0.05 sec)

mysql> insert into batches values(1,'batch_1');
Query OK, 1 row affected (0.01 sec)


   


mysql> insert into batches (name)values('batch_2'),('batch_2'),('batch_1'),('batch_1'),('batch_1');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from batches;

| id | name    |
|----|---------|
|  1 | batch_1 |
|  2 | batch_2 |
|  3 | batch_2 |
|  4 | batch_1 |
|  5 | batch_1 |
|  6 | batch_1 |

6 rows in set (0.00 sec)

mysql> create table courses(id int primary key auto_increment,name varchar(20));
Query OK, 0 rows affected (0.07 sec)

mysql> insert into courses values(1,'html');
Query OK, 1 row affected (0.01 sec)


insert into courses (name) values('css'),('js'),('html')' at line 1
mysql> insert into courses (name) values('css'),('js'),('html'),('html'),('css');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from courses;

| id | name |
|----|------|
|  1 | html |
|  2 | css  |
|  3 | js   |
|  4 | html |
|  5 | html |
|  6 | css  |

6 rows in set (0.00 sec)


Query OK, 0 rows affected (0.06 sec)

mysql> insert into batch_users values(1,1,1);
Query OK, 1 row affected (0.01 sec)


mysql> insert into batch_users (batch_id,user_id) values(1,2);
Query OK, 1 row affected (0.01 sec)
mysql> select users.id,batches.name from users inner join batches on users.id=batches.id;

| id | name    |
|----|---------|
|  1 | batch_1 |
|  2 | batch_2 |
|  3 | batch_2 |
|  4 | batch_1 |
|  5 | batch_1 |
|  6 | batch_1 |

6 rows in set (0.03 sec)

mysql> select users.id,users.name as user_name ,batches.name as batch_name from users inner join batches on users.id=batches.id;

| id | user_name | batch_name |
|----|-----------|------------|
|  1 | surya     | batch_1    |
|  2 | dhaiya    | batch_2    |
|  3 | surya     | batch_2    |
|  4 | yusuf     | batch_1    |
|  5 | suguram   | batch_1    |
|  6 | aswath    | batch_1    |

6 rows in set (0.00 sec)


mysql> select users.id,courses.name,batches.name as batch_name from users join batches on users.id=batches.id join courses on courses.id=users.id;

| id | name | batch_name |
|----|------|------------|
|  1 | html | batch_1    |
|  2 | css  | batch_2    |
|  3 | js   | batch_2    |
|  4 | html | batch_1    |
|  5 | html | batch_1    |
|  6 | css  | batch_1    |

6 rows in set (0.02 sec)


mysql> select courses.id,courses.name,batches.id,batches.name, users.id,users.name  from courses join  batches on courses.id=batches.id join users on users.id=courses.id where courses.name='html' and batches.name;
Empty set, 3 warnings (0.00 sec)

mysql> select courses.id,courses.name,batches.id,batches.name, users.id,users.name  from courses join  batches on courses.id=batches.id join users on users.id=courses.id where courses.name='html' and batches.name='batch_1';

| id | name | id | name    | id | name    |
|----|------|----|---------|----|---------|
|  1 | html |  1 | batch_1 |  1 | surya   |
|  4 | html |  4 | batch_1 |  4 | yusuf   |
|  5 | html |  5 | batch_1 |  5 | suguram |

3 rows in set (0.00 sec)
