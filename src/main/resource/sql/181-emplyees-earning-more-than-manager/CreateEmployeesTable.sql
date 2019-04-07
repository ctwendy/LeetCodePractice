ALTER table Employee add Name char(50), add ManagerId Integer;

insert into Employee
(
	Id, Name, Salary, ManagerId
) values
(1, 'Joe', 70000, 3),
(2, 'Henry', 80000, 4),
(3, 'Sam', 60000, NULL),
(4, 'Max', 90000,NULL);



