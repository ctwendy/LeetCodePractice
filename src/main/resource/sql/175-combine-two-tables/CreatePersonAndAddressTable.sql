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

insert into LeetCode.Person
(
	PersonId,
    FirstName,
    LastName
) values
(
	1,
    'Wendy',
    'Chen'
);

insert into LeetCode.Person
(
	PersonId,
    FirstName,
    LastName
) values
(
	2,
    'Dave',
    'Chen'
);

insert into LeetCode.Address
(
	AddressId,
    PersonId,
    City,
    State
) values
(
	1,
    2,
    'SF',
    'CA'
);





