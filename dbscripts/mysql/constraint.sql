SELECT
  *
FROM
  information_schema.table_constraints
WHERE
  TABLE_NAME = 'employees_test';

ALTER TABLE
  employees_test
MODIFY
  name varchar(50) NOT NULL;

ALTER TABLE
  employees_test
MODIFY
  name varchar(50) NULL;

ALTER TABLE
  employees_test
ADD
  email varchar(100) UNIQUE;