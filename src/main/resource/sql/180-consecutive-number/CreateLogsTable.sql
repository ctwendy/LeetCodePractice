create table Logs (
  Id int,
  num int
);

insert into Logs values
(3, 1),
(1, 1),
(4, 2),
(2, 1),
(5, 1),
(6, 2),
(7, 2),
(8, 2);

delete from Logs;

SET SQL_SAFE_UPDATES = 0;