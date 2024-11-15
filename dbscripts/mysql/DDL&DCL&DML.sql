CREATE DATABASE IF NOT EXISTS library CHARACTER SET 'utf8';

USE library;

CREATE TABLE IF NOT EXISTS books(
  id int,
  name varchar(50),
  author varchar(50),
  price float,
  publish_year year,
  category varchar(100),
  stock int
);

DESC books;

INSERT INTO
  books
VALUES
  (
    1,
    'peace world',
    'Jerry',
    98,
    '2008',
    'novel',
    1000
  );

INSERT INTO
  books(
    id,
    name,
    author,
    price,
    publish_year,
    category,
    stock
  )
VALUES
  (
    2,
    'The Battle',
    'Sara',
    199.8,
    '2010',
    'medicine',
    100
  );

UPDATE
  books
SET
  price = price + 5
WHERE
  category = 'novel';

UPDATE
  books
SET
  price = 100,
  category = 'drama'
WHERE
  id = 2;

DELETE FROM
  books
WHERE
  stock = 0;

SELECT
  *
FROM
  books
WHERE
  name LIKE '%a%';

SELECT
  count(*),
  sum(stock)
FROM
  books
WHERE
  name LIKE '%a%';

SELECT
  *
FROM
  books
WHERE
  category = 'novel'
ORDER BY
  price DESC;

SELECT
  *
FROM
  books
ORDER BY
  stock DESC,
  price ASC;

SELECT
  category,
  count(*)
FROM
  books
GROUP BY
  category;

SELECT
  category,
  sum(stock) stock_sum
FROM
  books
GROUP BY
  category
HAVING
  stock_sum > 50;

SELECT
  *
FROM
  books
LIMIT
  5, 5;

SELECT
  category,
  sum(stock) sum_stock
FROM
  books
GROUP BY
  category
ORDER BY
  sum_stock DESC
LIMIT
  1;

SELECT
  IFNULL(category, 'total'),
  sum(stock)
FROM
  books
GROUP BY
  category WITH rollup;

CREATE TABLE IF NOT EXISTS employees_test(
  id bigint UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  name varchar(50),
  gender enum('Male', 'Female'),
  birthday date
);