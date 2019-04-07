ALTER table Employee drop column ManagerId;

alter table Employee add DepartmentId int;

delete from Employee;

insert into Employee
(
	Id, Name, Salary, DepartmentId
) values
(1, 'Joe', 70000, 1),
(2, 'Henry', 80000, 2),
(3, 'Sam', 60000, 2),
(4, 'Max', 90000, 1);

create table Department
( 
	Id int,
    Name char(50)
);

insert into Department values
(1, 'IT'),
(2, 'Sales');

