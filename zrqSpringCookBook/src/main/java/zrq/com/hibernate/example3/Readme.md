CRUD Example with HIBERNATE

- SELECT *
- SELECT JOIN
- SELECT SINGLE
- INSERT
- UPDATE
- DELETE
- JDBC properties file. 
- Uses MySQL.

---------

# Run this SQL code beforehand:
I have tried this on a MySQL DB and worked fine.

```
CREATE TABLE CONTACT (
ID INT NOT NULL AUTO_INCREMENT
, FIRST_NAME VARCHAR(60) NOT NULL
, LAST_NAME VARCHAR(40) NOT NULL
, BIRTH_DATE DATE
, VERSION INT NOT NULL DEFAULT 0
, UNIQUE UQ_CONTACT_1 (FIRST_NAME, LAST_NAME)
, PRIMARY KEY (ID)
);

CREATE TABLE HOBBY (
HOBBY_ID VARCHAR(20) NOT NULL
, PRIMARY KEY (HOBBY_ID)
);

CREATE TABLE CONTACT_TEL_DETAIL (
ID INT NOT NULL AUTO_INCREMENT
, CONTACT_ID INT NOT NULL
, TEL_TYPE VARCHAR(20) NOT NULL
, TEL_NUMBER VARCHAR(20) NOT NULL
, VERSION INT NOT NULL DEFAULT 0
, UNIQUE UQ_CONTACT_TEL_DETAIL_1 (CONTACT_ID, TEL_TYPE)
, PRIMARY KEY (ID)
, CONSTRAINT FK_CONTACT_TEL_DETAIL_1 FOREIGN KEY (CONTACT_ID)
REFERENCES CONTACT (ID)
);

CREATE TABLE CONTACT_HOBBY_DETAIL (
CONTACT_ID INT NOT NULL
, HOBBY_ID VARCHAR(20) NOT NULL
, PRIMARY KEY (CONTACT_ID, HOBBY_ID)
, CONSTRAINT FK_CONTACT_HOBBY_DETAIL_1 FOREIGN KEY (CONTACT_ID)
REFERENCES CONTACT (ID) ON DELETE CASCADE
, CONSTRAINT FK_CONTACT_HOBBY_DETAIL_2 FOREIGN KEY (HOBBY_ID)
REFERENCES HOBBY (HOBBY_ID)
);

insert into contact (first_name, last_name, birth_date) values ('Chris', 'Schaefer', '1981-05-03');
insert into contact (first_name, last_name, birth_date) values ('Scott', 'Tiger', '1990-11-02');
insert into contact (first_name, last_name, birth_date) values ('John', 'Smith', '1964-02-28');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (1, 'Mobile', '1234567890');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (1, 'Home', '1234567890');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (2, 'Home', '1234567890');
insert into hobby (hobby_id) values ('Swimming');
insert into hobby (hobby_id) values ('Jogging');
insert into hobby (hobby_id) values ('Programming');
insert into hobby (hobby_id) values ('Movies');
insert into hobby (hobby_id) values ('Reading');
insert into contact_hobby_detail(contact_id, hobby_id) values (1, 'Swimming');
insert into contact_hobby_detail(contact_id, hobby_id) values (1, 'Movies');
insert into contact_hobby_detail(contact_id, hobby_id) values (2, 'Swimming');

```