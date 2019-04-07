
delete from Person where Id in
(select Id from 
(select p2.Id as Id, p2.Email as Email from Person p1 join Person p2 on p1.Email = p2.Email and p1.Id < p2.Id) as temp);

SET SQL_SAFE_UPDATES = 0;


select * from Person;

/*
DELETE p1
FROM Person p1, Person p2
WHERE p1.Email = p2.Email AND
p1.Id > p2.Id
*/

/*
delete from Person where Id not in ( select A.Id from (select min(Id) as Id from Person GROUP BY Email) A )
*/

