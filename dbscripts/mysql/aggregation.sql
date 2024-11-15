SELECT
  max(salaries.salary),
  min(salaries.salary),
  avg(salaries.salary),
  sum(salaries.salary)
FROM
  salaries;

SELECT
  titles.title,
  max(salaries.salary),
  min(salaries.salary),
  avg(salaries.salary),
  sum(salaries.salary)
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN titles ON employees.emp_no = titles.emp_no
GROUP BY
  titles.title;

SELECT
  titles.title,
  count(1)
FROM
  employees
  JOIN titles ON employees.emp_no = titles.emp_no
GROUP BY
  titles.title;

SELECT
  departments.dept_name,
  count(employees.emp_no),
  avg(salaries.salary) avg_salary
FROM
  employees
  JOIN salaries ON employees.emp_no = salaries.emp_no
  JOIN dept_emp ON dept_emp.emp_no = employees.emp_no
  JOIN departments ON departments.dept_no = dept_emp.dept_no
GROUP BY
  departments.dept_name
ORDER BY
  avg_salary DESC;