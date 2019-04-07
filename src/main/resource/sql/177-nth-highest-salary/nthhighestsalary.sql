SELECT max(Salary) Salary FROM Employee e
WHERE 3=(SELECT COUNT(DISTINCT Salary) FROM Employee p
WHERE e.Salary<=p.Salary)

/*
http://www.programmerinterview.com/index.php/database-sql/find-nth-highest-salary-sql/
*/




