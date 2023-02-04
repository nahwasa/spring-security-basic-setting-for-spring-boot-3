drop table if exists member CASCADE;
create table member
(
    id varchar(255),
    pw varchar(255),
    roles varchar(255),
    primary key (id)
);