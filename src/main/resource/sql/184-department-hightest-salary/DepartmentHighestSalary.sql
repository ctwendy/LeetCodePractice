select  d.Name as Department, e.Name as Employee, max_salary.Salary as Salary from
(select d.Id, max(Salary) as Salary from 
Employee e join Department d on e.DepartmentId = d.Id
group by d.Id) max_salary, Employee e, Department d
 where max_salary.Id = e.DepartmentId and 
 e.Salary = max_salary.Salary and
 d.Id = e.DepartmentId;

