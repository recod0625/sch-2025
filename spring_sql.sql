-- create database
create database hrdb_spring;

-- Select database
use hrdb_spring;
use sys;
select database();

-- check all table
show tables;

-- create taeble
create table employee (
	sno int primary key,
    name varchar(10), 
    address varchar(30),
    edate date
);

-- delete table
drop table employee; 

-- check created table
desc employee;

-- C(create) : 데이터 추가
insert into employee(sno, name, address)
values(1234, "홍길동", "서울시");

-- R(read) : 데이터 조회
select * from employee;
select sno, name, address from employee where sno = 1234;

-- U(Update) : 데이터 수정
update employee set name = "홍길순" where sno = "1234";



-- D(Delete) : 데이터 삭제
delete from employee where sno = 1234;
select * from employee;

-- add colum
alter table employee add column department varchar(20); 

select * from employee;

set sql_safe_updates = 0;

update employee set department = 'sales' where department is null;

set sql_safe_updates = 1;