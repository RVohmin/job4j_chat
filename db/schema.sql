drop table if exists messages;
drop table if exists persons;
drop table if exists rooms;
drop table if exists messages;



create table if not exists roles (
    id serial primary key not null,
    name varchar(50) not null unique
);

create table if not exists rooms (
    id serial primary key not null,
    name varchar(200) not null unique
);

create table if not exists persons (
    id serial primary key not null,
    username varchar(100) not null unique,
    password varchar(100) not null,
    role_id int references roles(id)
);

create table if not exists messages (
    id serial primary key not null,
    text varchar(2000) not null,
    created timestamp without time zone not null default now(),
    person_id int references persons(id),
    room_id int references rooms(id)
)