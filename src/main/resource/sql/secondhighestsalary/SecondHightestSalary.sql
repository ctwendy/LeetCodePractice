select * from Employee;

select max(Salary) as secondhighestsalary from Employee where Salary not in 
(
	select max(Salary) from Employee
);

-- delete from Employee where Id = 1;
-- delete from Employee where Id = 2;

-- SET SQL_SAFE_UPDATES = 0;



