create table Customers (
  Id int,
  Name char(50)
);

create table Orders (
  Id int,
  CustomerId int
);

insert into Customers values
(1, 'Joe'),
(2, 'Henry'),
(3, 'Sam'),
(4, 'Max');

insert into Orders values
(1, 3),
(2, 1);