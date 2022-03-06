### testing
### table1:(students)

```syntax
create table students (
id int primary key auto_increment,
name varchar(100) not null,
email varchar(100) not null,
mobile_no bigint not null,
password varchar(100) not null,
gender char(1) not null,
dob date,
created_date timestamp not null default current_timestamp,
unique (email),
check ( gender in ('M','F'))
); 
```
```syntax
SELECT * FROM students;
```

| id | name      | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |
|  2 | Abisha    | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   |
|  3 | Swetha    | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   |   NULL       |
|  4 | Saranya   | saran@gmail.com          | 9645789903   | saran@32  |  F     |   2022-03-01 14:00:08   | 2004-11-12   |


### table2: (student_class)

```syntax
create table studentClass (
id int primary key auto_increment,
student_id int not null,
class int not null,
status varchar(20) not null,
foreign key (student_id) references students(id) ON DELETE CASCADE ON UPDATE CASCADE,
check( class >= 1 and class <=12),
check (status in ('ACTIVE','INACTIVE'))
); 
```
```syntax
SELECT * FROM Student_class;
```

| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
| 1  |     1      |  12   | ACTIVE   |
| 2  |     2      |  5    | INACTIVE |
| 3  |     3      |  12   | ACTIVE   |

#### Feature 1: Student Registration :       

```syntax
INSERT INTO students (name,email,mobile_no,password,gender,dob) VALUES ('Aswath','gvm.222@gmail.com','7847898778','gvm@222','M','2009-05-22');
```
#### Feature 2: List All Students :

```syntax
SELECT * FROM students;
```
| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya  | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |
|  2 | Abisha     | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   |
|  3 | Swetha     | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | NULL         |
|  4 | Saranya    | saran003@gmail.com       | 9645789903   | saran@032 |  F     |   2022-03-01 14:00:08   | 2005-11-12   |
|  5 | Aswath     | gvm.222@gmail.com        | 7847898778   | gvm@222   |  F     |   2022-03-01 14:00:08   | 2009-05-22   |

###### Query ok, 5 row selected(0.01 sec)

#### Feature 3: Login with email and password 

```syntax
SELECT * FROM students WHERE email='loginers_mail' AND password='loginers_password';
```
Eg:
```syntax
SELECT * FROM students WHERE email='saranya003@gmail.com' AND password='saran@032';
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  4 | Saranya    | saran003@gmail.com       | 9645789903   | saran@032 |  F     |   2022-03-01 14:00:08   | 2005-11-12   |

###### Query ok, 1 row selected(0.00 sec)

#### Feature 4: Update Password

```syntax
UPDATE students SET email='jerusheya2002@gmail.com' WHERE id='1';
```
###### Query ok, 0 row selected(0.00 sec)

```syntax
SELECT * FROM students WHERE id='1';
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya  | jerusheya2002@gmail.com  | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |

###### Query ok, 1 row selected(0.00 sec)

#### Feature 5: Enroll Student into Class 

```syntax
INSERT INTO Student_class (student_id,class,status) VALUES (4,5,'ACTIVE');
```
```syntax
SELECT * FROM Student_class;
```

| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
| 1  |     1      |  12   | ACTIVE   |
| 2  |     2      |  5    | INACTIVE |
| 3  |     3      |  10   | ACTIVE   |
| 4  |     4      |   5   | ACTIVE   |

 ###### Query ok, 1 row selected(0.00 sec)

#### Feature 7: Update Student Class information 
Update student from 5th standard to 6th standard.

```syntax
UPDATE Student_class SET class=6 WHERE id=4;
```

#### Feature 8: Student withdrawn from a Class 

```syntax
DELETE FROM Student_class WHERE id=2;
```

#### Feature 9: Find student details who have not updated their Date Of Birth 

```syntax
SELECT * FROM students WHERE dob is NULL;
```
| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  3 | Swetha     | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | NULL         |

###### Query OK, 1 reo selected(0.00 sec)

#### Feature 10: Find Total no of students actively studying in this school 

```syntax
SELECT COUNT(status) FROM students WHERE status = 'ACTIVE';
```
| COUNT(status) |
|:--------------|
|     3         |

###### Query ok, 1 row selected (0.00 sec)

#### Feature 11: Find Total no of students actively studying in each class 

```syntax
SELECT class,COUNT(status) FROM Student_class WHERE status = 'ACTIVE' GROUP BY class;
```
| class | COUNT(status) |
|:------|:--------------|
|  12   |       1       | 
|  5    |       1       |
|  12   |       1       |
|  6    |       1       |

###### Query ok, 4 row selected (0.00 sec)

#### Feature 12: Find Total no of students actively studying each class which has less than 5 students. 

```syntax
SELECT class,COUNT(status) FROM Student_class WHERE status = 'ACTIVE' GROUP BY class WHERE COUNT(status)<5;
```
| class | COUNT(status) |
|:------|:--------------|
|  12   |       1       | 
|  5    |       1       |
|  12   |       1       |
|  6    |       1       |


###### Query ok, 4 rows selected(0.00 sec)


#### Feature 13 : Display student and class details using joins(inner join) :

```syntax
SELECT * FROM students INNER JOIN Student_class ON students.id=Student_class.student_id;
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          | id | student_id | class | status  |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|:---|:----------|:-----|:---------|
|  1 | Jerusheya  | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   | 1  |     1      |  12   | ACTIVE   |
|  2 | Abisha     | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   | 2  |     2      |  5    | INACTIVE |
|  3 | Swetha     | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | NULL         |  3  |     3      |  10   | ACTIVE   |
|  4 | Saranya    | saran003@gmail.com       | 9645789903   | saran@032 |  F     |   2022-03-01 14:00:08   | 2005-11-12   |4  |     4      |   5   | ACTIVE   |


###### Query ok,4 rows selected(0.00 sec)

#### Feature 14 : Display student details for 5th std :


```syntax
SELECT * FROM students INNER JOIN Student_class ON students.id=Student_class.student_id WHERE class=5;
```
Empty set (0.00 sec)
###  Find Class for the given student email id #
###  Email: n@gmail.com
```Syntax
select *from students where email like "_n%";
```

Empty set (0.00 sec)
### Feature 16: Find Students who has not enrolled in a class #
```syntax
 select * from students left join  student_class on students.id=student_class.id;
```

| id | name     | email          | mobile_no  | gender | dob        | created_data        | id   | student_id | class | status |
|----|----------|----------------|------------|--------|------------|---------------------|------|------------|-------|--------|
|  1 | Abisha   | abi@gmail.com  | 9715907384 | F      | 2003-06-03 | 2022-03-03 11:54:47 | NULL |       NULL |  NULL | NULL   |
|  2 | Jersheya | jeru@gmail.com | 9715987650 | F      | 2003-06-26 | 2022-03-03 11:56:15 | NULL |       NULL |  NULL | NULL   |

### Feature 17: Display all students name with class - include both enrolled and not enrolled #>
```Syntax
 select students.name,student_class.class from students left join student_class on students.id = student_class.id;
```

| name     | class |
|----------|-------|
| Abisha   |  NULL |
| Jersheya |  NULL |

2 rows in set (0.00 sec)
