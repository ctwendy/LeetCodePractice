select distinct(temp.num) as ConsecutiveNums from logs l3 join
(select l2.Id, l1.num from Logs l1 join Logs l2 on l1.num = l2.num and l1.Id + 1 = l2.Id) as temp
on l3.num = temp.num and temp.Id + 1 = l3.Id;

select * from Logs;

/*
Select DISTINCT l1.Num from Logs l1, Logs l2, Logs l3 
where l1.Id=l2.Id-1 and l2.Id=l3.Id-1 
and l1.Num=l2.Num and l2.Num=l3.Num
*/

/*
select distinct l1.num
from Logs l1 
    join Logs l2 on l1.id=l2.id-1 
    join Logs l3 on l1.id=l3.id-2
where l1.num=l2.num and l2.num=l3.num
*/

-- the following two won't be correct solution if we don't pull table that order by Id

/*
select DISTINCT num FROM
(select num,
	case 
		when @record = num then @count:=@count+1
		when @record <> @record:=num then @count:=1 
	end as n
    from 
	    (select * from Logs ,(select @count:=0,@record:=(SELECT num from Logs limit 0,1)) r order by Id) order_r
) a
where a.n>=3;
*/

/*
select distinct Num from (
    select
        Num,
        case
            when @prevNum = Num then @count := @count + 1
            when (@prevNum := Num) is not null then @count := 1
        end n
    from 
		(select * from Logs, (select @prevNum := NULL) r order by Id) order_r
    order by Id
) a where n >= 3;
*/