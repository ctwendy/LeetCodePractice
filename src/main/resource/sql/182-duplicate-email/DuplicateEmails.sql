select count.Email from 
(select count(Id) as num, Email from Person group by Email) as count
where count.num > 1;