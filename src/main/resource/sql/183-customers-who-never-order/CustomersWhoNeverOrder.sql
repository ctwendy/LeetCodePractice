-- use id a fit the scenario that customer have the same name.

select Name as Customers from Customers where Id not in 
(select s.Id from Customers s join Orders o on s.Id = o.CustomerId);

/*
SELECT A.Name from Customers A
LEFT JOIN Orders B on  a.Id = B.CustomerId
WHERE b.CustomerId is NULL
*/

/*
SELECT A.Name from Customers A
WHERE NOT EXISTS (SELECT 1 FROM Orders B WHERE A.Id = B.CustomerId)
*/