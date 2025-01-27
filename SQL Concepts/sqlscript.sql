create table bricks ( 
  colour      varchar2(10), 
  shape       varchar2(10), 
  quantity    integer, 
  unit_weight integer 
);

insert into bricks values ( 'red', 'cylinder', 1, 13 );

insert into bricks values ( 'blue', 'cube', 51, 8 );

insert into bricks values ( 'green', 'cube', 600, 8 );

commit;

select * from bricks;

update bricks 
set    /* TODO */unit_weight=21;

select unit_weight from bricks;

update bricks 
set    /* TODO */unit_weight=21;

rollback;

select unit_weight from bricks;

update bricks 
set unit_weight =5 
where  shape in (cube;);

update bricks 
set unit_weight =5 
where  shape in (cube);

update bricks 
set unit_weight =5 
where  cube in (shape);

update bricks 
set unit_weight =5 
where  shape like cube;

update bricks 
set unit_weight =5 
where  shape = 'cube';

update bricks 
set unit_weight =5 
where  shape like 'cube';

update bricks 
set unit_weight =5 
where  shape like '%cu';

update bricks 
set unit_weight =5 
where  shape like '%cu__';

update bricks 
set unit_weight =5 
where  shape like '%cu__';

select * from bricks;

update  bricks  
set quantity = quantity-10 
where colour ='green' 
and shape = 'cube';

commit;

select * from bricks;

update  bricks  
set quantity = quantity+10 
where colour ='blue' 
and shape = 'cube';

commit;

select * from bricks;

update bricks  
set quantity = 60 
declare  
	pragma autonoumous_transaction;

begin 
	update bricks 
	set unit_weight = 55; 
	commit; 
end; 
 
select * from bricks; 
 
rollback;
/

select * from burcks;

select * from bricks;

select * from bricks;

select * from bricks;

update bricks 
set quantity = 60, 
	unit_weight = 8 
where colour ='red'  
and shape = 'cyclinder' 
and quantity = 60 
and unit_weight = 13;

select * from bricks;

update bricks 
set quantity = 60, 
	unit_weight = 8 
where colour ='red'  
and shape = 'cyclinder' 
and quantity = 60 
and unit_weight = 13;

select * from bricks;

select * from bricks;

update bricks 
set quantity = 60, 
	unit_weight = 8 
where colour ='red'  
and shape = 'cylinder' 
and quantity = 60 
and unit_weight = 13;

select * from bricks;

select * from bricks;

update bricks 
set quantity = 60, 
	unit_weight = 8 
where colour ='red'  
and shape = 'cylinder' 
and quantity = 1 
and unit_weight = 21;

select * from bricks;

alter table bricks (version_number  integer default 1);

alter table bricks add (version_number  integer default 1);

select * from bricks;

update bricks  
set quantity = 60, 
	unit_weight = 8, 
	version_number = version_number +1;

where colour = 'red' 


and shape = 'cylinder' 


and version_number =1; 


select * from bricks;

update bricks  
set quantity = 60, 
	unit_weight = 8, 
	version_number = version_number +1 
where colour = 'red' 
and shape = 'cylinder' 
and version_number =1;

select * from bricks;

