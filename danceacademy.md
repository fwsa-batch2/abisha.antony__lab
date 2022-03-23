
#### show databases;



| Database           |
|--------------------|
| academy            |
| batch              |
| blazers            |
| examples           |
| exercise           |
| freshdance_academy |
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

18 rows in set (0.11 sec)

create database freshdance_academy;
###### Query OK, 1 row affected (0.01 sec)

#### use freshdance_academy;
Database changed

### creating Table_1
```syntax
create table users(id int primary key, name varchar(20) not null, phone bigint unique not null, email varchar(50) unique not null, password varchar(30) not null);
```
###### Query OK, 0 rows affected (0.04 sec)

### create table 
``` syntax 
 create table courses(course_id int primary key,course_name varchar(20) not null,level varchar(20) not null,fees tinyint,coaches varchar(20));
 ```
###### Query OK, 0 rows affected (0.03 sec)
``` syntax
 create table coaches(id int primary key,name varchar(20) not null,contact_no bigint,years_of_experience tinyint,dance_style varchar(20));
 ```
###### Query OK, 0 rows affected (0.03 sec)

``` syntax 
 create table reviews(id int primary key,user_id int,star int check(star<=5),comments varchar(30) not null);
```
###### Query OK, 0 rows affected (0.03 sec)

``` syntax 
 create table query(id int primary key,email varchar(20),message varchar(30));
```
###### Query OK, 0 rows affected (0.02 sec)

#### listing tables;
``` syntax
 show tables;
 ```

| Tables_in_freshdance_academy |
|------------------------------|
| coaches                      |
| courses                      |
| query                        |
| reviews                      |
| users                        |

5 rows in set (0.00 sec)

### table_1
### describe table
```syntax
 desc users;
 ```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(20) | NO   |     | NULL    |       |
| phone    | bigint      | NO   | UNI | NULL    |       |
| email    | varchar(50) | NO   | UNI | NULL    |       |
| password | varchar(30) | NO   |     | NULL    |       |

5 rows in set (0.01 sec)

##### inserting values into users
```syntax
 insert into users values (1,'swedha',9942153249,'swed@gmail.com','swedha');
 ```
###### Query OK, 1 row affected (0.02 sec)
```syntax
insert into users(id,name,phone,email,password) values (2,'nanthitha',9715907384,'dossjr@gmail.com','nanthitha'),
    -> (3,'santhoshi',7502869260,'susa@gmail.com','santhoshi'),
    -> (4,'pallavi',9445550324,'pallu@gmail.com','pallavi'),
    -> (5,'priya',9444550325,'priya@gmail.com','priya@gmail.com'),
    -> (6,'viknesh',9444550322,'viki@gmail.com','viknesh');
```
    
###### Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

#### listing values
``` syntax
 select * from users;
 ```

| id | name      | phone      | email            | password        |
|----|-----------|------------|------------------|-----------------|
|  1 | swedha    | 9942153249 | swed@gmail.com   | swedha          |
|  2 | nanthitha | 9715907384 | dossjr@gmail.com | nanthitha       |
|  3 | santhoshi | 7502869260 | susa@gmail.com   | santhoshi       |
|  4 | pallavi   | 9445550324 | pallu@gmail.com  | pallavi         |
|  5 | priya     | 9444550325 | priya@gmail.com  | priya@gmail.com |
|  6 | viknesh   | 9444550322 | viki@gmail.com   | viknesh         |

6 rows in set (0.00 sec)
``` syntax
 insert into users(id,name,phone,email,password) values(7, 'mani', 9876543219, 'mani@gmail.com', 'mani'),
    -> (8,'aswathy',9942175028,'aswathy@gmail.com','aswathy'),
    -> (9,'hezi',9876032145,'hezi@gmail.com','hezi'),
    -> (10,'santa',7896543215,'santa@gmail.com','sanboi');
 ```   
###### Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0
``` syntax
select * from users;
```

| id | name      | phone      | email             | password        |
|----|-----------|------------|-------------------|-----------------|
|  1 | swedha    | 9942153249 | swed@gmail.com    | swedha          |
|  2 | nanthitha | 9715907384 | dossjr@gmail.com  | nanthitha       |
|  3 | santhoshi | 7502869260 | susa@gmail.com    | santhoshi       |
|  4 | pallavi   | 9445550324 | pallu@gmail.com   | pallavi         |
|  5 | priya     | 9444550325 | priya@gmail.com   | priya@gmail.com |
|  6 | viknesh   | 9444550322 | viki@gmail.com    | viknesh         |
|  7 | mani      | 9876543219 | mani@gmail.com    | mani            |
|  8 | aswathy   | 9942175028 | aswathy@gmail.com | aswathy         |
|  9 | hezi      | 9876032145 | hezi@gmail.com    | hezi            |
| 10 | santa     | 7896543215 | santa@gmail.com   | sanboi          |

10 rows in set (0.01 sec)


### table_2
#### describe coaches
``` syntax
 desc coaches;
 ```

| Field               | Type        | Null | Key | Default | Extra |
|---------------------|-------------|------|-----|---------|-------|
| id                  | int         | NO   | PRI | NULL    |       |
| name                | varchar(20) | NO   |     | NULL    |       |
| contact_no          | bigint      | YES  |     | NULL    |       |
| years_of_experience | tinyint     | YES  |     | NULL    |       |
| dance_style         | varchar(20) | YES  |     | NULL    |       |

5 rows in set (0.00 sec)

#### inserting values into coaches
``` syntax
insert into coaches values(1,'nichole_concesso',7890654321,6,'hiphop');
```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(2,'salman_yusuf_khan',6926078965,4,'salsa');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(3,'sonali_bhaduria',7528054632,5,'garba');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(1,'nichole_concesso',7890654321,6,'hiphop');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(2,'salman_yusuf_khan',6926078965,4,'salsa');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(3,'sonali_bhaduria',7528054632,5,'garba');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into coaches values(4,'sonal_devaraj',8765546736,4,'bhangra');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
alter table coaches drop foreign key coaches_ibfk_1;
```
###### Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

####  listing values
``` syntax
 select * from coaches;
 ```

| id | name              | contact_no | years_of_experience | dance_style |
|----|-------------------|------------|---------------------|-------------|
|  1 | nichole_concesso  | 7890654321 |                   6 | hiphop      |
|  2 | salman_yusuf_khan | 6926078965 |                   4 | salsa       |
|  3 | sonali_bhaduria   | 7528054632 |                   5 | garba       |
|  4 | sonal_devaraj     | 8765546736 |                   4 | bhangra     |

4 rows in set (0.01 sec)


### table_3
#### describe courses
``` syntax
 desc courses;
 ```

| Field       | Type        | Null | Key | Default | Extra |
|-------------|-------------|------|-----|---------|-------|
| course_id   | int         | NO   | PRI | NULL    |       |
| user_id     | int         | YES  | MUL | NULL    |       |
| course_name | varchar(20) | NO   |     | NULL    |       |
| level       | varchar(20) | NO   |     | NULL    |       |
| fees        | tinyint     | YES  |     | NULL    |       |
| coaches_id  | int         | NO   | UNI | NULL    |       |

6 rows in set (0.01 sec)

#### modify table
``` syntax
 alter table courses modify fees int;
 ```
###### Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
alter table courses
    -> rename column coaches to coaches_id;
```
###### Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
 alter table courses
    -> modify coaches_id int unique not null;
```
###### Query OK, 0 rows affected, 1 warning (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 1

```
 alter table courses
    -> add foreign key(coaches_id) references coaches(id);

```
###### Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
 alter table courses modify coaches varchar(20) unique not null;
 ```
 ###### Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
alter table courses add column user_id int after course_id;
```
###### Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
 alter table courses add foreign key(user_id) references users(id);
 ```
###### Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0



#### INSERTING VALUES INTO COURSES

``` syntax
insert into courses values(1,1,'hiphop','beginner',1700,1);
```
###### Query OK, 1 row affected (0.01 sec)
``` syntax
 insert into courses values(1,1,'hiphop','beginner',1700,1);
 ```
###### Query OK, 1 row affected (0.01 sec)
``` syntax
 insert into courses values(2,2,'salsa','beginner',1700,2),(3,3,'garba','beginner',1700,3);
 ```
###### Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

#### listing values
``` syntax
 select * from courses;
 ```

| course_id | user_id | course_name | level    | fees | coaches_id |
|-----------|---------|-------------|----------|------|------------|
|         1 |       1 | hiphop      | beginner | 1700 |          1 |
|         2 |       2 | salsa       | beginner | 1700 |          2 |
|         3 |       3 | garba       | beginner | 1700 |          3 |

3 rows in set (0.00 sec)


##### table_4
#### describe reviews
``` syntax
 desc reviews;
 ```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| id       | int         | NO   | PRI | NULL    |       |
| user_id  | int         | YES  | MUL | NULL    |       |
| star     | int         | YES  |     | NULL    |       |
| comments | varchar(30) | NO   |     | NULL    |       |

4 rows in set (0.00 sec)


#### modify reviews
``` syntax
 alter table reviews modify star int check(star<=5);
 ```
###### Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

``` syntax
alter table reviews add foreign key(user_id) references users(id);
```
###### Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0


#### inserting values into reviews
``` syntax
 insert into reviews values(1,1,4,'awesome_website');
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into reviews values(2,2,5,'coolest_website');
 ```
###### Query OK, 1 row affected (0.01 sec)
``` syntax
 insert into reviews values(3,3,4,'nice');
 ```
###### Query OK, 1 row affected (0.01 sec)

##### listing values
``` syntax
 select * from reviews;
 ```

| id | user_id | star | comments        |
|----|---------|------|-----------------|
|  1 |       1 |    4 | awesome_website |
|  2 |       2 |    5 | coolest_website |
|  3 |       3 |    4 | nice            |

3 rows in set (0.00 sec)

##### table_5
#### describe table
```syntax
 desc query;
 ```

| Field   | Type        | Null | Key | Default | Extra |
|---------|-------------|------|-----|---------|-------|
| id      | int         | NO   | PRI | NULL    |       |
| email   | varchar(20) | YES  |     | NULL    |       |
| message | varchar(30) | YES  |     | NULL    |       |
| user_id | int         | YES  | MUL | NULL    |       |

4 rows in set (0.01 sec)

#### modify table
``` syntax
alter table query add column user_id int;
``` 
###### Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0
``` syntax
 alter table query add foreign key(user_id) references users(id);
 ```
###### Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

#### inserting values 
```syntax
 insert into query values(1,'swed@gmail.com','when_is_the_competition?',1);
 ```
###### Query OK, 1 row affected (0.01 sec)
``` syntax
 insert into query values(2,'dossjr@gmail.com','when_does_the_class_starts?',2);
 ```
###### Query OK, 1 row affected (0.01 sec)

``` syntax
 insert into query values(3,'susa@gmail.com','do_you_have_a_demo_class?',3);
 ```
###### Query OK, 1 row affected (0.01 sec)

 ```syntax
 select * from query;
 ```

| id | email            | message                     | user_id |
|----|------------------|-----------------------------|---------|
|  1 | swed@gmail.com   | when_is_the_competition?    |       1 |
|  2 | dossjr@gmail.com | when_does_the_class_starts? |       2 |
|  3 | susa@gmail.com   | do_you_have_a_demo_class?   |       3 |

3 rows in set (0.01 sec)























