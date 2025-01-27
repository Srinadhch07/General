create table toys ( 
  toy_name varchar2(30), 
  price    number(4, 2) 
);

insert into toys values ('Baby Turtle', 0.01);

insert into toys values ('Miss Snuggles', 0.51);

insert into toys values ('Cuteasaurus', 10.01);

insert into toys values ('Sir Stripypants', 14.03);

insert into toys values ('Purple Ninja', 14.22);

commit;

select * from toys;

delete * from toys;

rollback;

select * from toys;

select * from toys;

delete * from toys;

rollback;

select * from toys;

select * from toys;

delete * from toys;

select * from toys;

select * from toys;

delete from toys;

rollback;

select * from toys;

delete toys where price < 1;

select * from toys;

rollback;

select * from toys;

select * from toys;

delete toys where toy_name like '%Pur';

select * from toys;

rollback;

select * from toys;

delete toys where toy_name like 'Pur%';

select * from toys;

rollback;

select * from toys;

delete toys where toy_name like 'Pur%';

select * from toys;

rollback;

select * from toys;

truncate table toys


select * from toys;

rollback;

select * from toys;

select * from toys;

truncate table toys


select * from toys;

rollback;

select * from toys;

desc toys


truncate table toys reuse storage


alter table toys add (is_deleted varchar(2) default 'N');

delete toys;

insert into toys values('Baby Turtle',0.01,);

insert into toys (toy_name,price) values('Baby Turtle',0.01);

select * from toys;

insert into toys values ('Miss Snuggles', 0.51, 'N');

insert into toys values ('Cuteasaurus', 10.01, 'N');

insert into toys values ('Sir Stripypants', 14.03, 'N');

insert into toys values ('Purple Ninja', 14.22, 'N');

select * from toys;

commit;

insert into toys values ('Miss Snuggles', 0.51, 'N');

insert into toys values ('Cuteasaurus', 10.01, 'N');

insert into toys values ('Sir Stripypants', 14.03, 'N');

insert into toys values ('Purple Ninja', 14.22, 'N');

select * from toys;

commit;

insert into toys values ('Miss Snuggles', 0.51, 'N');

insert into toys values ('Cuteasaurus', 10.01, 'N');

insert into toys values ('Sir Stripypants', 14.03, 'N');

insert into toys values ('Purple Ninja', 14.22, 'N');

select * from toys;

commit;

update toys  
set is_deleted ='Y' 
where toy_name = 'Cuteeasaurus';

select * from toys;

update toys  
set is_deleted ='Y' 
where toy_name = 'Cuteasaurus';

select * from toys;

select * from toys  
where is_deleted not like 'Y';

create view active_toys as  
select toy_name,price  
where is_deleted ='N';

create view active_toys as  
select toy_name,price from toys 
where is_deleted ='N';

select * from active_toys;

insert into active_toys values('doroemon',2.99);

select * from active_toys;

select * from toys;

insert into toys value ('Nobita',3.20,'N');

select * from toys;

insert into toys values('Nobita',3.20,'N');

select * from toys;

insert into toys values('Nobita',3.20,'N');

select * from active_toys;

