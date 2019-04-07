select * from Employee;

delete from Employee where Salary < 1000;

SET SQL_SAFE_UPDATES = 0;

select e.Name as Employee from
Employee e join Employee m where 
e.ManagerId = m.Id and e.Salary > m.Salary;
