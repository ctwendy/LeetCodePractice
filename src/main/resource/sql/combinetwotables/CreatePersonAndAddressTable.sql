create table LeetCode.Person 
(
	PersonId int,
    FirstName varchar(20),
    LastName varchar(20),
    Primary key (PersonId)
);

create table LeetCode.Address 
(
	AddressId int,
    PersonId int,
    City varchar(100),
	State varchar(100),
    Primary key (AddressId)
);





