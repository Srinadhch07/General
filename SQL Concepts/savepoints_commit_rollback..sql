insert into bricks values(1,'Doreamon','blue');
exec savepoint checkpoint1;

insert into bricks values(2,'Ninja hatori','blue');
exec savepoint checkpoint2;

insert into bricks values(3,'Ben10','Green');
exec savepoint checkpoint3;

select * from bricks;

rollback to savepoint checkpoint3;
select * from bricks;

rollback to savepoint checkpoint2;
select * from bricks;

rollback to savepoint checkpoint1;
select * from bricks;

commit;
