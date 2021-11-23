drop table if exists review;
drop table if exists course;
drop table if exists person;
drop table if exists students;
drop table if exists seats;

create table course
(
    id               bigint not null auto_increment,
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

create table review
(
    id          bigint not null auto_increment,
    description varchar(255),
    rating      varchar(255),
    course_id   bigint,
    primary key (id)
);

alter table review
    add constraint foreign key (course_id)
        references course (id);
