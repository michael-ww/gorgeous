SELECT
  *
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
WHERE
  salaries.salary >(
    SELECT
      subSalaries.salary
    FROM
      salaries subSalaries
    WHERE
      subSalaries.emp_no = 10001
    ORDER BY
      subSalaries.salary DESC
    LIMIT
      1
  )
ORDER BY
  salaries.salary DESC
LIMIT
  20;

SELECT
  departments.dept_no,
  departments.dept_name,
  min(salaries.salary) min_salary
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON dept_emp.emp_no = employees.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
GROUP BY
  departments.dept_no,
  departments.dept_name
HAVING
  min_salary >(
    SELECT
      min(salaries.salary)
    FROM
      salaries
      JOIN dept_emp ON salaries.emp_no = dept_emp.emp_no
    WHERE
      dept_emp.dept_no = 'd005'
  )
ORDER BY
  min_salary;

SELECT
  departments.dept_no,
  departments.dept_name,
  avg(salaries.salary) avg_salary
FROM
  salaries
  JOIN dept_emp ON salaries.emp_no = dept_emp.emp_no
  JOIN departments ON departments.dept_no = dept_emp.dept_no
GROUP BY
  departments.dept_no,
  departments.dept_name
ORDER BY
  avg_salary
LIMIT
  1;

SELECT
  departments.dept_no,
  departments.dept_name,
  avg(salaries.salary) avg_salary
FROM
  departments
  JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
  JOIN salaries ON salaries.emp_no = dept_emp.emp_no
GROUP BY
  departments.dept_no,
  departments.dept_name
HAVING
  avg_salary <= ALL(
    SELECT
      avg(salaries.salary)
    FROM
      salaries
      JOIN dept_emp ON salaries.emp_no = dept_emp.emp_no
    GROUP BY
      dept_emp.dept_no
  );

SELECT
  employees.emp_no,
  employees.last_name,
  salaries.salary
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp outer_dept_emp ON employees.emp_no = outer_dept_emp.emp_no
WHERE
  salaries.salary >(
    SELECT
      avg(salaries.salary)
    FROM
      salaries
      JOIN dept_emp inner_dept_emp ON salaries.emp_no = inner_dept_emp.emp_no
    WHERE
      inner_dept_emp.dept_no = outer_dept_emp.dept_no
  );

SELECT
  employees.emp_no,
  employees.first_name,
  salaries.salary,
  avg_salary_table.avg_salary
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
  JOIN (
    SELECT
      dept_emp.dept_no,
      avg(salaries.salary) avg_salary
    FROM
      salaries
      JOIN dept_emp ON salaries.emp_no = dept_emp.emp_no
    GROUP BY
      dept_emp.dept_no
  ) avg_salary_table ON dept_emp.dept_no = avg_salary_table.dept_no
WHERE
  salaries.salary > avg_salary_table.avg_salary;

SELECT
  employees.emp_no,
  salaries.salary,
  dept_emp.dept_no,
  departments.dept_name
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE
  dept_emp.dept_no IN (
    SELECT
      dept_emp.dept_no
    FROM
      employees
      JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
    WHERE
      employees.first_name = 'Hatsukazu'
      AND employees.last_name = 'Zongker'
  );

SELECT
  employees.emp_no,
  salaries.salary,
  dept_emp.dept_no,
  departments.dept_name
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON salaries.emp_no = dept_emp.emp_no
  JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE
  salaries.salary > (
    SELECT
      avg(salaries.salary)
    FROM
      salaries
  );