select * from Employee;

-- max() function return null when there is not found
select max(Salary) as secondhighestsalary from Employee where Salary not in
(
	select max(Salary) from Employee
);

/*
another version of solution.
select max(Salary) as secondhighestsalary from Employee where Salary <
(
	select max(Salary) from Employee
);
*/

-- delete from Employee where Id = 1;
-- delete from Employee where Id = 2;

-- SET SQL_SAFE_UPDATES = 0;

/*
http://www.java67.com/2015/01/second-highest-salary-in-mysql-and-sql-server.html
*/



