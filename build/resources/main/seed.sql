create database testdb;
use testdb;
create table number(id varchar(255),counts int);
insert into number values('1',0);
update number set count=0 where id='1';
