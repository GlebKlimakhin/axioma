create table users(
    id bigserial not null primary key,
    name varchar(55) not null
);

insert into users(name) values
('Michael'),
('Nikolay'),
('Kathrine');