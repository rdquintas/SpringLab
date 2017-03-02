Simple HIBERNATE example:

- uses simple mapping XML config file
- NO Hibernate config XML. Everything is done by code
- it is necessary to run SQL before app 1st run, like this:


```
CREATE TABLE `student` (
    `id` INT(10) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NULL DEFAULT NULL,
    `rollnumber` INT(10) NULL DEFAULT NULL,
    `gender` TINYINT(4) NULL DEFAULT NULL,
    `class` VARCHAR(50) NULL DEFAULT NULL,
    `lastupdated` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);
```