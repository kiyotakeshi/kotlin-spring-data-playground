drop table if exists course CASCADE;
drop table if exists person CASCADE;
drop table if exists seats CASCADE;
drop table if exists students CASCADE;

create table course
(
    id               bigint not null,
    created_date     timestamp,
    last_update_date timestamp,
    name             varchar(255),
    primary key (id)
);

create table person
(
    id         integer not null auto_increment,
    birth_data date,
    location   varchar(255),
    name       varchar(255),
    primary key (id)
);

create table seats
(
    id   integer not null auto_increment,
    name varchar(255),
    primary key (id)
);

create table students
(
    id      integer not null auto_increment,
    name    varchar(255),
    seat_id integer,
    primary key (id)
);

alter table students
    add constraint foreign key (seat_id)
        references seats (id);
