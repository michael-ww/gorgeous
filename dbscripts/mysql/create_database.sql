-- from->on->(left/right)join->where->group by->having->select->distinct->order by->limit --
SELECT
  employees.emp_no,
  employees.first_name,
  salaries.salary,
  titles.title
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN titles ON titles.emp_no = employees.emp_no
WHERE
  employees.emp_no = 10001
LIMIT
  20;

SELECT
  employees.emp_no,
  employees.first_name,
  salaries.salary,
  titles.title
FROM
  employees
  LEFT JOIN salaries ON employees.emp_no = salaries.emp_no
  LEFT JOIN titles ON employees.emp_no = titles.emp_no
WHERE
  employees.emp_no = 10001
SELECT
  employees.first_name,
  salaries.salary,
  titles.title
FROM
  employees
  RIGHT JOIN salaries ON employees.emp_no = salaries.emp_no
  RIGHT JOIN titles ON employees.emp_no = titles.emp_no
WHERE
  employees.emp_no = 10001
LIMIT
  20;

SELECT
  employees.emp_no,
  employees.first_name,
  departments.dept_name
FROM
  employees
  JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE
  dept_emp.dept_no = 'd008';

SELECT
  mod(12, 5),
  abs(-12),
  sign(11),
  sign(-11),
  floor(11.2121),
  ceiling(144.23),
  pi(),
  least(1, 2, 3, 4, 5),
  greatest(11, 22, 44, 6),
  rand()
FROM
  dual;

SELECT
  rand(),
  rand(),
  rand(10),
  rand(10),
  rand(-10),
  rand(-10)
FROM
  dual;

SELECT
  round(123.456),
  round(123.4556, 3),
  TRUNCATE(123.456, 0),
  TRUNCATE(123.456, 1)
FROM
  dual;

SELECT
  TRUNCATE(round(123.456, 2), 0)
FROM
  dual;

SELECT
  radians(30),
  radians(45),
  radians(60),
  radians(90),
  radians(180),
  radians(270),
  radians(360)
FROM
  dual;

SELECT
  degrees(1),
  degrees(2),
  degrees(pi()),
  degrees(2 * pi())
FROM
  dual;

SELECT
  sin(radians(30)),
  cos(degrees(pi())),
  tan(45),
  asin(0.5),
  acos(0.6)
FROM
  dual;

SELECT
  ascii('r'),
  char_length('Hello'),
  char_length('我们'),
  length('Hello'),
  length('我们')
FROM
  dual;

SELECT
  curdate(),
  current_date(),
  curtime(),
  current_time(),
  NOW(),
  sysdate(),
  CURRENT_TIMESTAMP(),
  localtime(),
  localtimestamp(),
  utc_date(),
  utc_time(),
  utc_timestamp()
FROM
  dual;

SELECT
  unix_timestamp(),
  unix_timestamp('2022-05-16 21:00:00'),
  from_unixtime(1332324243)
FROM
  dual;

SELECT
  year(curdate()),
  MONTH(curdate()),
  DAY(current_date()),
  HOUR(current_time()),
  MINUTE(CURRENT_TIMESTAMP()),
  SECOND(current_time())
FROM
  dual;

SELECT
  monthname(NOW()),
  dayname(NOW()),
  weekday(NOW()),
  quarter(NOW()),
  week(utc_date()),
  dayofweek(sysdate()),
  dayofmonth(sysdate()),
  dayofyear(current_date())
FROM
  dual;

SELECT
  extract(
    year
    FROM
      sysdate()
  ),
  extract(
    MONTH
    FROM
      utc_timestamp()
  ),
  extract(
    DAY
    FROM
      utc_date()
  ),
  extract(
    quarter
    FROM
      sysdate()
  )
FROM
  dual;

SELECT
  get_format(datetime, 'ISO')
FROM
  dual;

SELECT
  concat(
    datediff(
      sysdate(),
      str_to_date(
        '1985-09-16 17:00:00',
        '%Y-%m-%d %H:%i:%s'
      )
    ),
    ' 天'
  ) "wen",
  concat(
    datediff(
      sysdate(),
      str_to_date(
        '1988-12-23 17:00:00',
        '%Y-%m-%d %H:%i:%s'
      )
    ),
    ' 天'
  ) "zhao",
  concat(
    datediff(
      sysdate(),
      str_to_date(
        '2017-05-21 11:00:00',
        '%Y-%m-%d %H:%i:%s'
      )
    ),
    ' 天'
  ) "zhen"
FROM
  dual;

SELECT
  employees.emp_no,
  employees.first_name,
  salaries.salary,
  CASE
    WHEN salaries.salary > 150000 THEN 'niubility+'
    WHEN salaries.salary > 100000 THEN 'niubility'
    WHEN salaries.salary > 50000 THEN 'niubility-'
    ELSE 'soso' "details"
  END
FROM
  employees
  LEFT JOIN salaries ON employees.emp_no = salaries.emp_no
ORDER BY
  salary DESC
LIMIT
  20;

SELECT
  md5('mysql'),
  sha('mysql')
FROM
  dual;

SELECT
  version(),
  connection_id(),
  DATABASE(),
  schema(),
  user(),
  current_user(),
  system_user(),
  CHARSET('mysql'),
  COLLATION('mysql')
FROM
  dual;

SELECT
  employees.emp_no,
  employees.first_name,
  employees.hire_date,
  datediff(curdate(), employees.hire_date) "totaldays"
FROM
  employees
ORDER BY
  totaldays DESC
LIMIT
  10;

SELECT
  avg(IFNULL(salaries.salary, 0)),
  sum(IFNULL(salaries.salary, 0)),
  max(salaries.salary),
  min(salaries.salary)
FROM
  salaries;

SELECT
  departments.dept_name,
  round(avg(salaries.salary)),
  sum(salaries.salary)
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
GROUP BY
  dept_emp.dept_no;

SELECT
  departments.dept_name,
  titles.title,
  round(avg(salaries.salary)) "avg_salary",
  sum(salaries.salary)
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
  JOIN titles ON employees.emp_no = titles.emp_no
GROUP BY
  dept_emp.dept_no,
  titles.title
ORDER BY
  departments.dept_name,
  avg_salary DESC;

SELECT
  departments.dept_no,
  departments.dept_name,
  max(salaries.salary) max_salary
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON dept_emp.emp_no = employees.emp_no
  JOIN departments ON departments.dept_no = dept_emp.dept_no
WHERE
  departments.dept_no IN ('d008', 'd007', 'd006', 'd001')
GROUP BY
  departments.dept_name
HAVING
  max_salary > 100000
ORDER BY
  max_salary DESC
LIMIT
  10;